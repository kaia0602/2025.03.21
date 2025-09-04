package org.zerock.tourist_spring.board.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.tourist_spring.board.dto.BoardDTO;
import org.zerock.tourist_spring.board.dto.PageRequestDTO;
import org.zerock.tourist_spring.board.service.BoardService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@Log4j2
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String list(@Valid
                       PageRequestDTO pageRequestDTO, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            pageRequestDTO = PageRequestDTO.builder().build();
        }
        model.addAttribute("responseDTO", boardService.getList(pageRequestDTO));
        return "/list";
    }

    @GetMapping("/view")
    public void view(Model model, int num , PageRequestDTO pageRequestDTO) {
        model.addAttribute("dto", boardService.getByNum(num));
    }

    @GetMapping("/edit")
    public void edit(Model model, int num, PageRequestDTO pageRequestDTO) {
        model.addAttribute("dto", boardService.getByNum(num));
    }

    @PostMapping("/edit")
    public String editPost(BoardDTO boardDTO, RedirectAttributes redirectAttributes, PageRequestDTO pageRequestDTO) {
        redirectAttributes.addAttribute("page", pageRequestDTO.getPage());
        redirectAttributes.addAttribute("size", pageRequestDTO.getSize());
        if(!boardDTO.getTitle().isEmpty() && boardDTO.getContent() != null) {
            String result = boardService.editBoard(boardDTO);
            redirectAttributes.addFlashAttribute("msg", result);
            redirectAttributes.addAttribute("num", boardDTO.getNum());
            return "redirect:/view";
        } else {
            redirectAttributes.addFlashAttribute("msg", "failed to edit board!");
            redirectAttributes.addAttribute("num", boardDTO.getNum());
            return "redirect:/edit";
        }
    }

    @PostMapping("/remove")
    public String remove(int num, PageRequestDTO pageRequestDTO, RedirectAttributes redirectAttributes) {
        BoardDTO dto = boardService.getByNum(num);
        redirectAttributes.addAttribute("page", pageRequestDTO.getPage());
        redirectAttributes.addAttribute("size", pageRequestDTO.getSize());
        if(dto != null){
            boardService.removeBoard(num);
            return "redirect:/list";
        } else {
            return "redirect:/list?errorMsg=error";
        }
    }

    @GetMapping("/write")
    public String write(PageRequestDTO pageRequestDTO, RedirectAttributes redirectAttributes, Model model, HttpSession  session)
      {
        if (session.getAttribute("userId") == null) {
            redirectAttributes.addFlashAttribute("msg", "You need to be logged in!");
            return "redirect:/list";
        }
        return "/write";
    }

    @PostMapping("/write")
    public String writePost(BoardDTO boardDTO, RedirectAttributes redirectAttributes, HttpSession session) {
        if (session.getAttribute("userId") == null) {
            redirectAttributes.addFlashAttribute("msg", "You need to be logged in!");
            return "redirect:/list";
        }
        String id = session.getAttribute("userId").toString();
        boardDTO.setId(id);
        int num = boardService.addBoard(boardDTO);

        return "redirect:/view?num=" + num;
    }


}

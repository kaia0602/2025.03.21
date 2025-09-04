package org.zerock.tourist_springboot.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.zerock.tourist_springboot.domain.Board;
import org.zerock.tourist_springboot.service.BoardService;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/list")
    public String getBoards(Model model) {
        List<Board> boardList = boardService.findAll();
        model.addAttribute("boardList", boardList);
        return "list";
    }

    @GetMapping("/view/{num}")
    public String getBoard(@PathVariable("num") long num, Model model) {

        model.addAttribute("dto", boardService.findById(num));

        return "view";
    }

    @GetMapping("/edit/{num}")
    public String editBoard(@PathVariable("num") long num, Model model) {
        model.addAttribute("dto", boardService.findById(num));
        return "edit";
    }

    @PostMapping("/edit/{num}")
    public String editBoard(@ModelAttribute("dto") Board dto, @PathVariable("num") long num) {
        dto.setNum(num);

        return "redirect:/list";
    }





}

package org.zerock.springex2.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.springex2.dto.MemberDTO;
import org.zerock.springex2.dto.TodoDTO;
import org.zerock.springex2.service.MemberService;

import javax.servlet.http.HttpSession;

@Controller
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String join() {
        return "/member/join";
    }

    @PostMapping("/join")
    public String joinPost(MemberDTO memberDTO) {
        memberService.join(memberDTO);
        return "redirect:/member/login";
    }

    @GetMapping("/login")
    public String loginGet() {
        return "/member/login";
    }

    @PostMapping("/login")
    public String loginPost(String id, String pw, HttpSession session,
                            RedirectAttributes redirectAttributes) {
        MemberDTO memberDTO = memberService.getMember(id, pw);
        if (memberDTO != null && memberDTO.getId() != null) {
            session.setAttribute("userId", memberDTO.getId());
            session.setAttribute("userDTO", memberDTO);
            return "redirect:/todo/list";
        } else {
            redirectAttributes.addFlashAttribute("loginErrMsg", "아이디나 비밀번호를 확인 해주세요");
            return "redirect:/member/login";
        }
    }

    @GetMapping("/logout")
    public String logoutGet(HttpSession session) {
        session.removeAttribute("userId");
        session.removeAttribute("userDTO");
        session.invalidate();
        return "redirect:/todo/list";
    }

    @PostMapping("/remove")
    public String remove(HttpSession session, String id  ) {
        MemberDTO dto =memberService.getOneMember(id);
        if (dto != null){
           memberService.removeMember(id);
            return "redirect:/member/login";
        } else {
            return "redirect:/todo/list?errorMsg=error";
        }

    }





}

package org.zerock.tourist_spring.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.tourist_spring.member.dto.MemberDTO;
import org.zerock.tourist_spring.member.service.MemberService;

import javax.servlet.http.HttpSession;

@Controller
@Log4j2
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/join")
    public String join() {
        return "join";
    }

    @PostMapping("/join")
    public String joinPost(MemberDTO memberDTO) {
        memberService.join(memberDTO);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String loginGet() {
        return "/login";
    }

    @PostMapping("/login")
    public String loginPost(String id, String password, HttpSession session,
                            RedirectAttributes redirectAttributes) {
        MemberDTO memberDTO = memberService.getMember(id, password); // 계정과 일치하는 데이터를 저장
        if (memberDTO != null && memberDTO.getId() != null) {
            session.setAttribute("userId", memberDTO.getId());
            session.setAttribute("userDTO", memberDTO);
            return "redirect:/";
        } else {
            redirectAttributes.addFlashAttribute("loginErrMsg", "아이디나 비밀번호를 확인 해주세요");
            return "redirect:/login";
        }
    }

    @GetMapping("/logout")
    public String logoutGet(HttpSession session) {
    // 세션의 데이터가 각각 삭제되는 경우
    session.removeAttribute("userId");
    session.removeAttribute("userDTO");
    // 세션의 데이터를 모두 삭제하는 경우
    session.invalidate();
        return "redirect:/";
    }
}

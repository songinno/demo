package info.moviepedia.demo.member.controller;

import info.moviepedia.demo.member.domain.Member;
import info.moviepedia.demo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/member")
public class MemberController {
    private final MemberService memberService;

    //회원정보 화면 요청
    @GetMapping("/list")
    public String memberList(Model model) {
        log.info("member/list GET!" );
        List<Member> members = memberService.getMembers();
        model.addAttribute("members" , members);


        return "member/memberList";
    }

}

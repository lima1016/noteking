package com.project.noteking.web.member.controller;

import com.project.noteking.web.member.model.MemberSignUpDto;
import com.project.noteking.web.member.service.MemberService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("member")
@Api("Member Controller API")
@SessionAttributes("loginUser")
public class MemberController {

  @Resource
  MemberService memberService;

  @PostMapping("signUp")
  public void signUpMember(MemberSignUpDto memberSignUpDto) {

    memberService.insertMember(memberSignUpDto);
  }

  @PostMapping("signIn")
  public String signInMember(String id, String password, HttpServletResponse response, HttpSession session) {
    // 로그인한 유저의 아이디를 쿠키로 보내고 세션 관리하는 로직 생각중
    // 아니면 auth filter 로 둘중 하나는 해야할듯
    return null;
  }
}

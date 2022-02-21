package com.project.noteking.web.member.controller;

import com.project.noteking.web.member.model.Member;
import com.project.noteking.web.member.model.MemberSignUpDto;
import com.project.noteking.web.member.service.MemberService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("member")
@Api("Member Controller API")
@SessionAttributes("loginUser")
public class MemberController {

  @Resource
  MemberService memberService;

  @ApiOperation(value = "회원 가입")
  @PostMapping("signUp")
  public void signUpMember(MemberSignUpDto memberSignUpDto) {

    memberService.insertMember(memberSignUpDto);
  }

  @ApiOperation(value = "로그인")
  @PostMapping("signIn")
  public void signInMember(String email, String password, HttpServletResponse response, HttpSession session) {

    Member member = memberService.findByIdPassword(email, password);

    if (member == null) {
      throw new NullPointerException("해당하는 아이디나 없거나 비밀번호가 맞지 않습니다.");
    }
    Cookie cookie = new Cookie("email", email);
    // (10 * 60) 600초로 10분
    // 3600초 30분
    cookie.setMaxAge(60 * 60);
    session.setAttribute("loginUser", member);
    response.addCookie(cookie);
  }
}

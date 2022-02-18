package com.project.noteking.web.member.controller;

import com.project.noteking.web.member.domain.MemberDto;
import com.project.noteking.web.member.service.MemberService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;

@RestController
@RequestMapping("member")
@Api("Member Controller API")
@SessionAttributes("loginUser")
public class MemberController {

  @Resource
  MemberService memberService;

  @PostMapping("")
  public void signUpMember(MemberDto memberDto) {

    memberService.insertMember(memberDto);
  }
}

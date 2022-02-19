package com.project.noteking.web.member.service;

import com.project.noteking.web.member.model.MemberSignUpDto;
import com.project.noteking.web.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberServiceImpl implements MemberService{

  @Resource
  MemberRepository memberRepository;

  @Override
  public void insertMember(MemberSignUpDto memberDto) {
    memberRepository.insertMember(memberDto);
  }
}

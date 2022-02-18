package com.project.noteking.web.member.service;

import com.project.noteking.web.member.domain.MemberDto;
import com.project.noteking.web.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MemberServiceImpl implements MemberService{

  @Resource
  MemberRepository memberRepository;

  @Override
  public void insertMember(MemberDto memberDto) {
    memberRepository.insertMember(memberDto);
  }
}

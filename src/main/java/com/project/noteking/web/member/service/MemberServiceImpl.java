package com.project.noteking.web.member.service;

import com.project.noteking.web.member.model.Member;
import com.project.noteking.web.member.model.MemberSignUpDto;
import com.project.noteking.web.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class MemberServiceImpl implements MemberService{

  @Resource
  MemberRepository memberRepository;

  @Override
  public void insertMember(MemberSignUpDto memberDto) {
    memberRepository.insertMember(memberDto);
  }

  @Override
  public Member findByIdPassword(String email, String password) {
    Map<String,Object> map = new HashMap<>();
    map.put("email", email);
    map.put("password", password);

    return memberRepository.findByIdPassword(map);
  }
}

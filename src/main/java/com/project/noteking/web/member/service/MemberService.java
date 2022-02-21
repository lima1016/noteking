package com.project.noteking.web.member.service;

import com.project.noteking.web.member.model.Member;
import com.project.noteking.web.member.model.MemberSignUpDto;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
  void insertMember(MemberSignUpDto memberDto);

  Member findByIdPassword(String email, String password);

}

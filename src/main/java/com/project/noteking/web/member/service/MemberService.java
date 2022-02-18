package com.project.noteking.web.member.service;

import com.project.noteking.web.member.domain.MemberDto;
import org.springframework.stereotype.Service;

@Service
public interface MemberService {
  void insertMember(MemberDto memberDto);
}

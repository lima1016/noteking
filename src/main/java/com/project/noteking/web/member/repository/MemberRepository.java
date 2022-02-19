package com.project.noteking.web.member.repository;

import com.project.noteking.web.member.model.MemberSignUpDto;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
  void insertMember(MemberSignUpDto memberDto);
}

package com.project.noteking.web.member.repository;

import com.project.noteking.web.member.model.Member;
import com.project.noteking.web.member.model.MemberSignUpDto;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface MemberRepository {
  void insertMember(MemberSignUpDto memberDto);

  Member findByIdPassword(Map<String,Object> map);
}

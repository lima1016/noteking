package com.project.noteking.web.member.repository;

import com.project.noteking.web.member.domain.MemberDto;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository {
  void insertMember(MemberDto memberDto);
}

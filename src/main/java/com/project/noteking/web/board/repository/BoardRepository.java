package com.project.noteking.web.board.repository;

import com.project.noteking.web.board.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {
  List<Board> findAll();
}

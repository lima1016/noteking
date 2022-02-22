package com.project.noteking.web.board.repository;

import com.project.noteking.web.board.model.Board;
import com.project.noteking.web.board.model.BoardUpdateDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository {
  List<Board> findAll();

  void insert(Board board);

  Board findBy(int boardId);

  void update(BoardUpdateDto boardUpdateDto);
}

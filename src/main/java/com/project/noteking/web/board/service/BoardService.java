package com.project.noteking.web.board.service;

import com.project.noteking.web.board.model.Board;
import com.project.noteking.web.board.model.BoardDto;
import com.project.noteking.web.board.model.BoardUpdateDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BoardService {

  List<Board> findAll();

  void insert(Board board);

  Board findBy(int boardId);

  void update(BoardUpdateDto boardUpdateDto);
}

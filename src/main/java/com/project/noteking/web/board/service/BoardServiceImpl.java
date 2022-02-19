package com.project.noteking.web.board.service;

import com.project.noteking.web.board.repository.BoardRepository;
import com.project.noteking.web.board.model.Board;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

  @Resource
  BoardRepository boardRepository;


  @Override
  public List<Board> findAll() {
    return boardRepository.findAll();
  }

  @Override
  public void insert(Board board) {
    boardRepository.insert(board);
  }

  @Override
  public Board findBy(int boardId) {
    return boardRepository.findBy(boardId);
  }
}

package com.project.noteking.web.board.service;

import com.project.noteking.web.board.repository.BoardRepository;
import com.project.noteking.web.board.domain.Board;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

  @Resource
  BoardRepository boardDao;


  @Override
  public List<Board> findAll() {
    return boardDao.findAll();
  }

  @Override
  public void insert(Board board) {
    boardDao.insert(board);
  }
}

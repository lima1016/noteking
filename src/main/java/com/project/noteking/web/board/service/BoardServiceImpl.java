package com.project.noteking.web.board.service;

import com.project.noteking.web.board.dao.BoardDao;
import com.project.noteking.web.board.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

  @Resource
  BoardDao boardDao;


  @Override
  public List<Board> findAll() {
    return boardDao.findAll();
  }
}

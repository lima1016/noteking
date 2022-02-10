package com.project.noteking.web.board.service;

import com.project.noteking.web.board.domain.Board;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public interface BoardService {

  List<Board> findAll();

  void insert(Board board);

}

package com.project.noteking.web.board.controller;

import com.project.noteking.config.FileWrite;
import com.project.noteking.web.board.domain.Board;
import com.project.noteking.web.board.service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import java.util.List;

@RestController
@Api("Board Controller API")
@SessionAttributes("loginUser")
public class BoardController {

  @Resource
  private BoardService boardService;

//  public BoardController(ServletContext sc) {
//    FileWrite.uploadDir = sc.getRealPath("/upload/board");
//  }

  @ApiOperation(value = "게시판 목록")
  @GetMapping("list")
  public List<Board> selectList() {
    return boardService.findAll();
  }

//  @ApiOperation(value = "게시판 등록")
//  @PostMapping("insert")
//  public String insertBoard(Board board, MultipartFile file) throws Exception {
//    FileWrite fileWrite = new FileWrite();
//    board.setImg(fileWrite.writeFile(file));
//    boardService.insert(board);
//    return "list";
//  }
}

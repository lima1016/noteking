package com.project.noteking.web.board.controller;

import com.project.noteking.config.FileWrite;
import com.project.noteking.web.board.domain.Board;
import com.project.noteking.web.board.service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api("Board Controller API")
@SessionAttributes("loginUser")
public class BoardController {

  @Resource
  private BoardService boardService;

  private FileWrite fileWrite;

  @ApiOperation(value = "게시판 목록", notes = "board_id, user_id, title, date, name(Member), nickname(Member)")
  @GetMapping("list")
  public List<Board> selectList() {
    return boardService.findAll();
  }
}

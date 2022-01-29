package com.project.noteking.web.board.controller;

import com.project.noteking.web.board.domain.Board;
import com.project.noteking.web.board.service.BoardService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api("Board Controller API")
public class BoardController {

  @Resource
  private BoardService boardService;

  @ApiOperation(value = "test", notes = "테스트입니다.")
  @ApiResponses({
      @ApiResponse(code = 200, message = "OK~!"),
      @ApiResponse(code = 404, message = "page not found!!!")
  })
  @GetMapping("list")
  public void selectList(Model model) {
    List<Board> boardList = boardService.findAll();
    model.addAttribute("boardList", boardList);
  }

  @ApiOperation(value = "signIn", notes = "테fdfse다.")
  @PostMapping("signin")
  public void signIn() {

  }
}
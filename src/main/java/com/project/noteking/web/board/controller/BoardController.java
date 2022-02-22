package com.project.noteking.web.board.controller;

import com.project.noteking.web.board.model.Board;
import com.project.noteking.web.board.model.BoardDto;
import com.project.noteking.web.board.model.BoardUpdateDto;
import com.project.noteking.web.board.service.BoardService;
import com.project.noteking.web.file.FileWriteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("board")
@Api("Board Controller API")
@SessionAttributes("loginUser")
public class BoardController {

  @Resource
  private BoardService boardService;

  @Resource
  private FileWriteService fileWriteService;

  public String uploadDir;

  @ApiOperation(value = "게시판 목록")
  @GetMapping("list")
  public List<Board> selectList() {
    return boardService.findAll();
  }

  @ApiOperation(value = "게시판 등록")
  @PostMapping("insert")
  public BoardDto insertBoard(BoardDto boardDto, MultipartFile file) throws Exception {

    boardService.insert(
        Board.builder()
            .userId(boardDto.getUserId())
            .title(boardDto.getTitle())
            .note(boardDto.getNote())
            .img(fileWriteService.writeFile(file))
            .userId(boardDto.getUserId())
            .build());
    return boardDto;
  }

  @ApiOperation(value="게시판 디테일")
  @GetMapping("detail")
  public Board detailBoard(int boardId) {
    return boardService.findBy(boardId);
  }

  @ApiOperation(value = "게시판 업데이트")
  @PostMapping("update")
  public void updateBoard(BoardUpdateDto boardUpdateDto) {
    boardService.update(boardUpdateDto);
  }
}

package com.project.noteking.web.board.domain;

import com.project.noteking.web.member.domain.Member;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.sql.Date;

@Data
public class Board {
  @ApiModelProperty(notes = "게시물 번호", example = "auto_increment")
  private int board_id;
  @ApiModelProperty(notes = "회원 번호")
  private int user_id;
  @ApiModelProperty(notes = "글 제목", example = "TEXT")
  private String title;
  @ApiModelProperty(notes = "글 내용", example = "TEXT")
  private String note;
  @ApiModelProperty(notes = "사진", example = "TEXT")
  private String img;
  @ApiModelProperty(notes = "수정 날짜", example = "DATE")
  private String edit_date;
  @ApiModelProperty(notes = "작성 날짜", example = "DATE")
  private String date;

  private Member member;
}

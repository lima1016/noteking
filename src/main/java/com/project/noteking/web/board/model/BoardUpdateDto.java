package com.project.noteking.web.board.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.noteking.web.member.model.Member;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardUpdateDto {

  @ApiModelProperty(notes = "게시물 번호")
  @JsonProperty("board_id")
  private int boardId;

  @ApiModelProperty(notes = "회원 번호")
  @JsonProperty("user_id")
  private int userId;

  @ApiModelProperty(notes = "글 제목")
  private String title;

  @ApiModelProperty(notes = "글 내용")
  private String note;

  @ApiModelProperty(notes = "사진")
  private String img;

  @ApiModelProperty(notes = "수정 날짜")
  @JsonProperty("edit_date")
  private String editDate;
}

package com.project.noteking.web.board.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.noteking.web.member.domain.Member;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
  @ApiModelProperty(notes = "회원 번호")
  @JsonProperty("user_id")
  private int userId;

  @ApiModelProperty(notes = "글 제목")
  private String title;

  @ApiModelProperty(notes = "글 내용")
  private String note;

}

package com.project.noteking.web.member.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Member {

  @ApiModelProperty(notes = "유저 번호")
  private int user_id;
  @ApiModelProperty(notes = "유저이름")
  private String name;
  @ApiModelProperty(notes = "유저 별명")
  private String nick_name;
  @ApiModelProperty(notes = "이메일(로그인시)")
  private String email;
  @ApiModelProperty(notes = "비밀번호")
  private String password;
  @ApiModelProperty(notes = "조인날짜")
  private String join_date;
}

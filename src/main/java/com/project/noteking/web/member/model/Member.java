package com.project.noteking.web.member.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Member {

  @ApiModelProperty(notes = "유저 번호")
  @JsonProperty("user_id")
  private int userId;
  @ApiModelProperty(notes = "유저이름")
  private String name;
  @ApiModelProperty(notes = "유저 별명")
  @JsonProperty("nick_name")
  private String nickName;
  @ApiModelProperty(notes = "이메일(로그인시)")
  private String email;
  @ApiModelProperty(notes = "비밀번호")
  private String password;
  @ApiModelProperty(notes = "조인날짜")
  @JsonProperty("join_date")
  private String joinDate;
}

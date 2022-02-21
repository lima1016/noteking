package com.project.noteking.web.member.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberSignUpDto {
  @ApiModelProperty(notes = "유저이름")
  private String name;

  @ApiModelProperty(notes = "유저 별명")
  @JsonProperty("nick_name")
  private String nickName;

  @ApiModelProperty(notes = "이메일(로그인시)")
  private String email;

  @ApiModelProperty(notes = "비밀번호")
  private String password;
}

package com.project.noteking.web.board.domain;

import lombok.Data;

import java.sql.Date;

@Data
public class Board {
  private int board_id;
  private int user_id;
  private String title;
  private String note;
  private String img;
  private Date edit_datee;
  private Date date;

}

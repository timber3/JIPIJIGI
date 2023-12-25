package com.jpjg.Ji_Pi_Ji_Gi.board.Dto;

import lombok.Data;

@Data
public class BoardDto {

    private int boardNo;
    private String userId;
    private String boardTitle;
    private String boardContent;
    private String boardTime;
    private int boardHit;
    private int boardWatch;
}

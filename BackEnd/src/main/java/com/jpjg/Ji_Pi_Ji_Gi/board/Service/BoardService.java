package com.jpjg.Ji_Pi_Ji_Gi.board.Service;

import com.jpjg.Ji_Pi_Ji_Gi.board.Dto.BoardDto;
import com.jpjg.Ji_Pi_Ji_Gi.board.Dto.BoardResultDto;

import java.sql.SQLException;

public interface BoardService {
    BoardResultDto write(BoardDto boardDto);
}

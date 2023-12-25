package com.jpjg.Ji_Pi_Ji_Gi.board.Mapper;

import com.jpjg.Ji_Pi_Ji_Gi.board.Dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.sql.SQLException;

@Mapper
public interface BoardMapper {
    void writeBoard(BoardDto boardDto) throws SQLException;
}

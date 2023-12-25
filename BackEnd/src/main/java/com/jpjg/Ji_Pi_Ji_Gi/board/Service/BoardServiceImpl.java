package com.jpjg.Ji_Pi_Ji_Gi.board.Service;

import com.jpjg.Ji_Pi_Ji_Gi.board.Dto.BoardDto;
import com.jpjg.Ji_Pi_Ji_Gi.board.Dto.BoardResultDto;
import com.jpjg.Ji_Pi_Ji_Gi.board.Mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BoardServiceImpl implements BoardService{

    private final BoardMapper boardMapper;
    public BoardServiceImpl(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }
    @Override
    public BoardResultDto write(BoardDto boardDto) {
        BoardResultDto boardResultDto = new BoardResultDto();
        boardResultDto.setStatus("201");
        boardResultDto.setMsg("성공");
        try {
            boardMapper.writeBoard(boardDto);
        } catch (Exception e) {
            log.error("error occurred : ",e);
            boardResultDto.setStatus("500");
            boardResultDto.setMsg("에러 발생");
        } finally {
            return boardResultDto;
        }
    }
}

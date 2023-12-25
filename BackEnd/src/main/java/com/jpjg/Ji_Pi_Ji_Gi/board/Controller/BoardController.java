package com.jpjg.Ji_Pi_Ji_Gi.board.Controller;

import com.jpjg.Ji_Pi_Ji_Gi.board.Dto.BoardDto;
import com.jpjg.Ji_Pi_Ji_Gi.board.Dto.BoardResultDto;
import com.jpjg.Ji_Pi_Ji_Gi.board.Service.BoardService;
import com.jpjg.Ji_Pi_Ji_Gi.board.Service.BoardServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 프론트에서 보내는 데이터의 변수명이 백에서 받는 변수명이랑 같으면 DTO객체로 받을 수 있다.
    @PostMapping
    public ResponseEntity<BoardResultDto> write(@RequestBody BoardDto boardDto) {
        BoardResultDto resultDto = boardService.write(boardDto);

        return new ResponseEntity<BoardResultDto>(resultDto, HttpStatus.OK);
    }
}

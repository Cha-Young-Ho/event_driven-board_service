package com.youngho.board.board;

import com.youngho.board.board.dto.BoardOfCreate;
import com.youngho.board.common.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

    /**
     * 글 생성
     */
    @PostMapping("/board")
    public Mono<Board> createBoard(@RequestBody BoardOfCreate boardDto){
        return boardService.createBoard(boardDto);
    }

    /**
     * 글 조회
     */

    /**
     * 글 수정
     */
}

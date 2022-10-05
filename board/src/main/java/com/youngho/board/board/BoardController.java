package com.youngho.board.board;

import com.youngho.board.board.dto.BoardOfCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
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
    @GetMapping("/board")
    public Mono<Board> getBoard(@RequestParam String boardId){
        return boardService.getBoard(boardId);
    }

}

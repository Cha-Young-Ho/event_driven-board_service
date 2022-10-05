package com.youngho.board.board;

import com.youngho.board.board.dto.BoardOfCreate;
import com.youngho.board.common.response.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public Mono<Board> createBoard(BoardOfCreate boardDto){

        Mono<Board> board = boardRepository.save(Board.builder()
                .content(boardDto.getContent())
                .writer(boardDto.getWriter())
                .title(boardDto.getTitle())
                .build());

        return board;
    }

}

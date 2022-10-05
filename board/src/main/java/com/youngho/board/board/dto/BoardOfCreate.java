package com.youngho.board.board.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class BoardOfCreate {

    private String writer;

    private String title;

    private String content;

    private LocalDateTime createdAt;

}

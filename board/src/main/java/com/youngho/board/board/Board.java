package com.youngho.board.board;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("board")
public class Board {

    @PrimaryKey()
    @Builder.Default
    private String id = UUID.randomUUID().toString();;

    private String content;

    private String title;

    private String writer;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

}

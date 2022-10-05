package com.youngho.board.board;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.time.LocalDateTime;


@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("chats")
public class Board {

    @PrimaryKey()
    private String id;

    private String content;

    private String title;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

}

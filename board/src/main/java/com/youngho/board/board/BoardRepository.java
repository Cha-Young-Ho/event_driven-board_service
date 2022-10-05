package com.youngho.board.board;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

public interface BoardRepository extends ReactiveCassandraRepository<Board, String> {
}

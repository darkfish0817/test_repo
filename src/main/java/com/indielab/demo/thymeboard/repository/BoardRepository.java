package com.indielab.demo.thymeboard.repository;

import com.indielab.demo.thymeboard.model.Board;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface BoardRepository extends Repository<Board, Long> {
    List<Board> findAll();
    Board findById(Long id);

    void save(Board board);
}

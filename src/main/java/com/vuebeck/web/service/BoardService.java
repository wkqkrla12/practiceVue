package com.pratice.web.service;

import com.pratice.web.entity.Board;

import java.util.List;

public interface BoardService {
    List <Board> getList();

    void saveBoard(Board board);

}

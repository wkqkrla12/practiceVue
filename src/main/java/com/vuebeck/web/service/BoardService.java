package com.vuebeck.web.service;


import com.vuebeck.web.entity.Board;

import java.util.List;

public interface BoardService {
    List <Board> getList();

    void saveBoard(Board board);

}

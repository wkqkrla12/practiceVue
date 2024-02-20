package com.vuebeck.web.service;


import com.vuebeck.web.entity.Board;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoardService {
    List <Board> getList();

    void saveBoard(Board board);

    Board getBoardById(Long id);
}

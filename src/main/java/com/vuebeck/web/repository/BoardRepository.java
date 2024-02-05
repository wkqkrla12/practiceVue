package com.vuebeck.web.repository;

import com.vuebeck.web.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {


    List<Board> findAll();
    void saveBoard(Board board);

}

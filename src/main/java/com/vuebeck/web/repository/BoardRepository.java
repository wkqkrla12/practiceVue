package com.pratice.web.repository;

import com.pratice.web.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardRepository {


    List<Board> findAll();
    void saveBoard(Board board);

}

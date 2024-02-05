package com.pratice.web.service;


import com.pratice.web.entity.Board;

import com.pratice.web.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImp implements BoardService{

    @Autowired
    BoardRepository repository;


    @Override
    public List<Board> getList() {
        return repository.findAll();
    }

    @Override
    public void saveBoard(Board board) {
        repository.saveBoard(board);
    }
}

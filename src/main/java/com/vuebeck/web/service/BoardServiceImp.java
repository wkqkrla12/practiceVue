package com.vuebeck.web.service;


import com.vuebeck.web.entity.Board;
import com.vuebeck.web.repository.BoardRepository;
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

    @Override
    public Board getBoardById(Long id) {
        return repository.findById(id);
    }
}

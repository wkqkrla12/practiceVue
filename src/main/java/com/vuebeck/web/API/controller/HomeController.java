package com.vuebeck.web.API.controller;


import com.vuebeck.web.entity.Board;
import com.vuebeck.web.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private BoardService service;

//    @GetMapping("/")
//    public List<Board> home() {
//        return service.getList();
//    }

    @GetMapping("/")
    public List<Board> getAllBoards() {

        return service.getList();
    }

    @PostMapping("/create")
    public ResponseEntity<String> createBoard(@RequestBody Board board) {

        service.saveBoard(board);
        System.out.println(board);
        return ResponseEntity.ok("Board created successfully");
    }
}

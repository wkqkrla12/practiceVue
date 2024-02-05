package com.vuebeck.web.API.controller;


import com.vuebeck.web.entity.Board;
import com.vuebeck.web.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/board")
public class ApiHomeController {

    @Autowired
    private BoardService service;

    @GetMapping("/list")
    public List<Board> getAllBoards() {
        return service.getList();
    }


}

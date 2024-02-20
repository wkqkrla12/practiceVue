package com.vuebeck.web.API.controller;


import com.vuebeck.web.entity.Board;
import com.vuebeck.web.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board-list")
public class BoardController {

    @Autowired
    private BoardService service;

    @GetMapping("/{id}")
    public Board getBoardById(@PathVariable ("id") Long id) {

        System.out.println(id);

        return service.getBoardById(id);
    }
}
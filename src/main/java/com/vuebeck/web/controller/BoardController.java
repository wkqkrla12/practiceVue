package com.vuebeck.web.controller;



import com.vuebeck.web.entity.Board;
import com.vuebeck.web.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping("/")
    public String index(Model model) {


        List<Board> list = boardService.getList();

        model.addAttribute("list", list);


        return "index.html";
    }

}

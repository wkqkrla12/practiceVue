package com.vuebeck.web;

import com.vuebeck.web.entity.Home;
import com.vuebeck.web.repository.HomeRepository;
import com.vuebeck.web.service.HomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import java.util.List;

@SpringBootTest
class VuebeckApplicationTests {


    @Autowired
    private HomeService service;

    @Autowired
    private HomeRepository repository;

    int data;

    @Test
    void contextLoads(Model model) {

        List<Home> list = service.getList();

       model.addAttribute("list",list);

        System.out.println(list);

    }

}

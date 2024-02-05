package com.vuebeck.web.service;

import com.vuebeck.web.entity.Home;
import com.vuebeck.web.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImp implements HomeService{

    @Autowired
    HomeRepository repository;


    @Override
    public List <Home> getList() {
        return repository.findAll();
    }
}

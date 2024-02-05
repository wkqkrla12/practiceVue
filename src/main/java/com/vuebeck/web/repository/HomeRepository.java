package com.pratice.web.repository;


import com.pratice.web.entity.Home;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeRepository {

    List<Home> findAll();
}

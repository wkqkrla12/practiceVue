package com.vuebeck.web.repository;


import com.vuebeck.web.entity.Home;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HomeRepository {

    List<Home> findAll();

}

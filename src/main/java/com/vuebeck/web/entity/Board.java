package com.pratice.web.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Board {


    private int no;
    private int hit;
    private String name;
    private Date regdate;
}

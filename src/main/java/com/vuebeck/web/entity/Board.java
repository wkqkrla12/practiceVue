package com.vuebeck.web.entity;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {


    private int id;
    private int hit;
    private String name;
    private LocalDateTime regdate;
    private String subject;
}

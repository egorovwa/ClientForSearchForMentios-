package com.example.clientfindnews.models;


import lombok.Data;

import java.util.List;

@Data
public class Question {

    private Integer id;
    private String name;
    private List<RequestWord> words;

}

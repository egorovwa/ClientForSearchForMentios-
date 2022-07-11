package com.example.clientfindnews.models;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data

public class NewsSource {

    String name;
    String inId;
    String link;
    String contry;
    List<News> newsList = new ArrayList<>();
    Category category;

}

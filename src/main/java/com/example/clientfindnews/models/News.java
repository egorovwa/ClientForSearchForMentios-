package com.example.clientfindnews.models;


import lombok.Data;

@Data
public class News {
    Integer id;
    private String newsSource;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;
    private String content;
    private String positiveStatus;
    private Category category;
    private RequestWord word;

}

package com.example.clientfindnews.service;

import com.example.clientfindnews.models.InStatus;
import com.example.clientfindnews.models.News;

import java.util.List;

public interface NewsService {
   List<News> findAllNews();
   void setStatusNews(InStatus inStatus);

    List<News> findByPositiveStatus();
}

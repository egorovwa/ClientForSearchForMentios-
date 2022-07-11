package com.example.clientfindnews.controllers;

import com.example.clientfindnews.client.ClientFindNews;
import com.example.clientfindnews.models.InStatus;
import com.example.clientfindnews.models.News;
import com.example.clientfindnews.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.InetSocketAddress;
import java.util.List;

@Controller
@RequestMapping("/news")
@RequiredArgsConstructor
public class NewsController {
    private final NewsService newsService;
    @ModelAttribute(name = "news")
    public List<News> nnews() {
        return newsService.findAllNews();
    }


    @GetMapping
    public String showNews() {
        return "newsview";
    }
    @PutMapping
    public void setStatus(InStatus inStatus){
newsService.setStatusNews(inStatus);

    }

}

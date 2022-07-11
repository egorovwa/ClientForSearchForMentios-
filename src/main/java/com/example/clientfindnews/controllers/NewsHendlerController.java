package com.example.clientfindnews.controllers;

import com.example.clientfindnews.models.News;
import com.example.clientfindnews.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/news/hendler")
@RequiredArgsConstructor
public class NewsHendlerController {
    private final NewsService newsService;
    @ModelAttribute(name = "news")
    public List<News> nnews() {
        return newsService.findByPositiveStatus();
    }

}

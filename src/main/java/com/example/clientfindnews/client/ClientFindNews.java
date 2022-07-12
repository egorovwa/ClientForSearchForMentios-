package com.example.clientfindnews.client;

import com.example.clientfindnews.models.News;
import com.example.clientfindnews.models.PositiveStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@FeignClient(value = "clientNews",url = "localhost:8080/")

public interface ClientFindNews {
    @GetMapping("/news")
    public List<News> findAll();

    @GetMapping("/news/status")
    public List<News> findByPositivStatusStatusNews(@RequestParam PositiveStatus positiveStatus);
    @PutMapping("/news")
    public News updateNews(@RequestBody News news);

}

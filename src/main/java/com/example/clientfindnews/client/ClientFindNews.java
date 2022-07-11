package com.example.clientfindnews.client;

import com.example.clientfindnews.models.News;
import com.example.clientfindnews.models.PositiveStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.List;


@FeignClient(value = "clientNews",url = "localhost:8080/")

public interface ClientFindNews {
    @GetMapping("/news")
    public List<News> findAll();

    @GetMapping("/news/status")
    public List<News> findByPositivStatusStatusNews(@RequestParam PositiveStatus positiveStatus);
    @PutMapping("/status/{id}")
    public News selectStatus(@RequestParam PositiveStatus positiveStatus, @PathParam("id") int id);

}

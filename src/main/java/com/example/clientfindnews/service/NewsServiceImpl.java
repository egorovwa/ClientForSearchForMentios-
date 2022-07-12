package com.example.clientfindnews.service;

import com.example.clientfindnews.client.ClientFindNews;
import com.example.clientfindnews.models.InStatus;
import com.example.clientfindnews.models.News;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;
import static com.example.clientfindnews.models.PositiveStatus.*;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final ClientFindNews clientFindNews;

    @Override
    public List<News> findAllNews() {
        return clientFindNews.findAll();
    }

    @Override
    public void setStatusNews(News news) {
        clientFindNews.updateNews(news);

    }

    @Override
    public List<News> findByPositiveStatus() {
        return clientFindNews.findByPositivStatusStatusNews(UNDEFINDED);
    }
}

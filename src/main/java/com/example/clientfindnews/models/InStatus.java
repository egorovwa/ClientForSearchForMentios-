package com.example.clientfindnews.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InStatus {
   private String status;
   private Integer newsId;

   public InStatus(Integer newsId) {
      this.newsId = newsId;
   }
}

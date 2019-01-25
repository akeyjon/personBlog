package com.cn.article.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cn.article.entity.Article;
import com.cn.article.service.ArticleService;
import com.cn.common.BaseController;

/**
 * @author dailongwen
 *
 */
@RestController
@RequestMapping("/article")
public class ArticleController extends BaseController{

  @Autowired
  private ArticleService articleService;
  
  @GetMapping("/limit")
  public List<Article> getRecentArticle(@RequestParam("limit") Integer value) {
    List<Article> listRecentArticle = articleService.listRecentArticle(value);
    return listRecentArticle;
    
  }
}

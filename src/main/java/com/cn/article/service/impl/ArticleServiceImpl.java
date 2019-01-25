package com.cn.article.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.article.entity.Article;
import com.cn.article.mapper.ArticleMapper;
import com.cn.article.service.ArticleService;
import com.github.pagehelper.PageInfo;

/**
 * @author dailongwen
 *
 */
@Service
public class ArticleServiceImpl implements ArticleService{
  
  @Autowired
  private ArticleMapper articleMapper;

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#countArticle(java.lang.Integer)
   */
  @Override
  public Integer countArticle(Integer status) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#countArticleComment()
   */
  @Override
  public Integer countArticleComment() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#countArticleView()
   */
  @Override
  public Integer countArticleView() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#countArticleByCategoryId(java.lang.Integer)
   */
  @Override
  public Integer countArticleByCategoryId(Integer categoryId) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#countArticleByTagId(java.lang.Integer)
   */
  @Override
  public Integer countArticleByTagId(Integer tagId) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listArticle(java.util.HashMap)
   */
  @Override
  public List<Article> listArticle(HashMap<String, Object> criteria) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<Article> listRecentArticle(Integer limit) {
    
    return articleMapper.listArticleByLimit(limit);
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#updateArticleDetail(com.cn.article.entity.Article)
   */
  @Override
  public void updateArticleDetail(Article article) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#updateArticle(com.cn.article.entity.Article)
   */
  @Override
  public void updateArticle(Article article) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#deleteArticleBatch(java.util.List)
   */
  @Override
  public void deleteArticleBatch(List<Integer> ids) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#deleteArticle(java.lang.Integer)
   */
  @Override
  public void deleteArticle(Integer id) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#pageArticle(java.lang.Integer, java.lang.Integer, java.util.HashMap)
   */
  @Override
  public PageInfo<Article> pageArticle(Integer pageIndex, Integer pageSize,
      HashMap<String, Object> criteria) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#getArticleByStatusAndId(java.lang.Integer, java.lang.Integer)
   */
  @Override
  public Article getArticleByStatusAndId(Integer status, Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listArticleByViewCount(java.lang.Integer)
   */
  @Override
  public List<Article> listArticleByViewCount(Integer limit) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#getAfterArticle(java.lang.Integer)
   */
  @Override
  public Article getAfterArticle(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#getPreArticle(java.lang.Integer)
   */
  @Override
  public Article getPreArticle(Integer id) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listRandomArticle(java.lang.Integer)
   */
  @Override
  public List<Article> listRandomArticle(Integer limit) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listArticleByCommentCount(java.lang.Integer)
   */
  @Override
  public List<Article> listArticleByCommentCount(Integer limit) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#insertArticle(com.cn.article.entity.Article)
   */
  @Override
  public void insertArticle(Article article) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#updateCommentCount(java.lang.Integer)
   */
  @Override
  public void updateCommentCount(Integer articleId) {
    // TODO Auto-generated method stub
    
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#getLastUpdateArticle()
   */
  @Override
  public Article getLastUpdateArticle() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listArticleByCategoryId(java.lang.Integer, java.lang.Integer)
   */
  @Override
  public List<Article> listArticleByCategoryId(Integer cateId, Integer limit) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listArticleByCategoryIds(java.util.List, java.lang.Integer)
   */
  @Override
  public List<Article> listArticleByCategoryIds(List<Integer> cateIds, Integer limit) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listCategoryIdByArticleId(java.lang.Integer)
   */
  @Override
  public List<Integer> listCategoryIdByArticleId(Integer articleId) {
    return null;
  }

  /* (non-Javadoc)
   * @see com.cn.article.service.ArticleService#listAllNotWithContent()
   */
  @Override
  public List<Article> listAllNotWithContent() {
    return articleMapper.listArticle();
  }

}

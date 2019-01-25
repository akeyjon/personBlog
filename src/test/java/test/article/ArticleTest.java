/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * 
 * 项目名：	personBlog
 * 文件名：	ArticleTest.java
 * 模块说明：	
 * 修改历史：
 * 2019年1月25日 - dailongwen - 创建。
 */
package test.article;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cn.article.entity.Article;
import com.cn.article.mapper.ArticleMapper;

import test.BaseTest;

/**
 * @author dailongwen
 *
 */
public class ArticleTest extends BaseTest{

  @Autowired
  private ArticleMapper articleMapper;
  
  @Test
  public void test() {
    List<Article> listArticleByLimit = articleMapper.listAllNotWithContent();
    
    System.out.println("============");
    for(Article article : listArticleByLimit) {
      System.out.println(article);
    }
  }
}

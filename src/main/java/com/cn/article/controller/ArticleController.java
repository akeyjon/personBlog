/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * 
 * 项目名：	personBlog
 * 文件名：	ArticleController.java
 * 模块说明：	
 * 修改历史：
 * 2019年1月25日 - dailongwen - 创建。
 */
package com.cn.article.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cn.common.BaseController;

/**
 * @author dailongwen
 *
 */
@RestController
@RequestMapping("/test")
public class ArticleController extends BaseController{

  @GetMapping("/hello")
  public String test() {
    return "hello, zookeeper";
  }
}

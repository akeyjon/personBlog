/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2019，所有权利保留。
 * 
 * 项目名：	personBlog
 * 文件名：	BaseController.java
 * 模块说明：	
 * 修改历史：
 * 2019年1月25日 - dailongwen - 创建。
 */
package com.cn.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author dailongwen
 *
 */
public class BaseController {

  public HttpServletRequest getRequest() {
    ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
        .getRequestAttributes();
    HttpServletRequest request = requestAttributes.getRequest();
    return request;
  }

  public HttpServletResponse getResponse() {
    ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder
        .getRequestAttributes();
    HttpServletResponse response = requestAttributes.getResponse();
    return response;
  }
}

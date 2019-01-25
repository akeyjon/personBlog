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

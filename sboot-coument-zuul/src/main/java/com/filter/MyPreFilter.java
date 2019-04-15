package com.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * zuul pre 过滤器 ,请求前执行
 */
public class MyPreFilter extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(MyPreFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        String requestURI = request.getRequestURI();
        logger.info("...zuul pre 过滤器请求url:"+requestURI);
        logger.info("...zuul pre 过滤器请求Method"+request.getMethod());
        return null;
    }
}

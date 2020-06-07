package com.greenjava.bookdetailsservice.client;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
public class FeignClientFactory implements RequestInterceptor {

    private String AUTHORIZATION = "Authorization";

    @Override
    public void apply(RequestTemplate requestTemplate) {

        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes attributes = (ServletRequestAttributes) requestAttributes;
        String token = attributes.getRequest().getHeader(AUTHORIZATION);

        requestTemplate.header(AUTHORIZATION, token);
    }
}

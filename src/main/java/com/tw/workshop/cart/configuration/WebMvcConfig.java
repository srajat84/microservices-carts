package com.tw.workshop.cart.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.MappedInterceptor;
import com.tw.workshop.cart.middleware.HTTPMonitoringInterceptor;

@Configuration
public class WebMvcConfig {
    @Bean
    HTTPMonitoringInterceptor httpMonitoringInterceptor() {
        return new HTTPMonitoringInterceptor();
    }

    @Bean
    public MappedInterceptor myMappedInterceptor(HTTPMonitoringInterceptor interceptor) {
        return new MappedInterceptor(new String[]{"/**"}, interceptor);
    }
}

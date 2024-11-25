package com.spring.rest.template.microservicestask4.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Configuration
@ComponentScan("com.spring.rest.template.microservicestask4")
public class MyConfiguration {
    @Bean
    public RestTemplate restTemplate() {  // это класс, предоставляемый Spring, который упрощает взаимодействие с HTTP-сервисами.
        return new RestTemplate();
    }

    @Bean
    public HttpHeaders httpHeaders() {  //то класс, представляющий HTTP-заголовки. В данном методе создаются заголовки, которые устанавливают тип содержимого (Content-Type) и тип принимаемого содержимого (Accept) как application/json.
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}

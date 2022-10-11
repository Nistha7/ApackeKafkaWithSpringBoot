package com.example.springbootkafkatutorialdemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopic {

    @Bean
    public NewTopic topic1(){
        return TopicBuilder.name("firstTopic")
                .build();
    }

    @Bean
    public NewTopic topic2(){
        return TopicBuilder.name("firstTopic_json")
                .build();
    }
}

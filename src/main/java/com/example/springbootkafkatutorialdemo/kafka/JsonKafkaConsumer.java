package com.example.springbootkafkatutorialdemo.kafka;

import com.example.springbootkafkatutorialdemo.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "firstTopic_json", groupId="myGroup")                   //there can be any no of subscribers to a topic i,e, consume method
    public void consume(User user){
        LOGGER.info(String.format("Message received %s",user.toString()));
    }
}

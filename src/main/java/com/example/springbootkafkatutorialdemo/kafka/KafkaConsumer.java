package com.example.springbootkafkatutorialdemo.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "firstTopic", groupId="myGroup")                   //there can be any no of subscribers to a topic i,e, consume method
    public void consume(String message){
        LOGGER.info(String.format("Message received %s",message));
    }

}

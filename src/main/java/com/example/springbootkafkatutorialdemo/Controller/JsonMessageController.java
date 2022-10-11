package com.example.springbootkafkatutorialdemo.Controller;


import com.example.springbootkafkatutorialdemo.dto.User;
import com.example.springbootkafkatutorialdemo.kafka.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/kafka")
public class JsonMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody User user){

        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message sent to the topic");
    }
}

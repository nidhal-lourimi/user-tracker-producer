package com.example.usertrackingproducer;

import com.example.usertrackingproducer.model.Event;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
@Slf4j

public class UserTrackingProducerApplication {
    EventGenerator eventGenerator = new EventGenerator();
    public static void main(String[] args) {
        SpringApplication.run(UserTrackingProducerApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String,Object> kafkaTemplate){
       return args -> {
           Event event = eventGenerator.generateEvent();
           kafkaTemplate.send(String.valueOf(event),event);

       };
    }
}

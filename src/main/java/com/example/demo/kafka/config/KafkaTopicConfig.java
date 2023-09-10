package com.example.demo.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class KafkaTopicConfig {

    @Bean
    public NewTopic topic1() {
        return new NewTopic("reflectoring-1", 3, (short) 3);
    }

    @Bean
    public NewTopic topic2() {
        return new NewTopic("reflectoring-2", 3 , (short)3 );
    }

}

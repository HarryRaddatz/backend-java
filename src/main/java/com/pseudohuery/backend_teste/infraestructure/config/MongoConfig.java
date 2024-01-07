package com.pseudohuery.backend_teste.infraestructure.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@Configuration
@EnableMongoRepositories(basePackages = "com.pseudohuery.backend_teste.domain.repository", mongoTemplateRef = "mongoTemplate")
public class MongoConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.data.mongodb")
    MongoClient mongoClient() {
        return MongoClients.create();
    }

    @Bean(name = "mongoTemplate")
    MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "mongoDBLilly");
    }
}
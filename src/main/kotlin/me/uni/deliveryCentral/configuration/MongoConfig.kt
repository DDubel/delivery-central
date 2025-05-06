package me.uni.deliveryCentral.configuration

import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@Configuration
@EnableMongoRepositories(basePackages = ["me.uni.deliveryCentral"])
class MongoConfig : AbstractMongoClientConfiguration() {
    override fun getDatabaseName(): String = "your_database_name"

    @Bean
    override fun mongoClient(): MongoClient {
        return MongoClients.create("mongodb://localhost:27017")
    }
}
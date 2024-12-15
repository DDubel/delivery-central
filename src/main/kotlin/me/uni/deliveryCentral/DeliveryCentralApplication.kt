package me.uni.deliveryCentral

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity

@SpringBootApplication
@EnableWebSecurity
class DeliveryCentralApplication

fun main(args: Array<String>) {
    runApplication<DeliveryCentralApplication>(*args)
}

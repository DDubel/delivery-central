package me.uni.deliveryCentral.queue

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig {
//    @Bean
//    fun orderQueue(): Queue {
//        return Queue("orderQueue", true)
//    }
//
//    @Bean
//    fun orderAckQueue(): Queue {
//        return Queue("orderAckQueue", true)
//    }
//
//    @Bean
//    fun exchange(): DirectExchange {
//        return DirectExchange("orders")
//    }
//
//    @Bean
//    fun orderBinding(orderQueue: Queue, exchange: DirectExchange): Binding {
//        return BindingBuilder.bind(orderQueue()).to(exchange()).with("order")
//    }
//
//    @Bean
//    fun orderAckBinding(orderAckQueue: Queue, exchange: DirectExchange): Binding {
//        return BindingBuilder.bind(orderAckQueue()).to(exchange()).with("orderAck")
//    }
//    @Bean
//    fun messageConverter(): Jackson2JsonMessageConverter {
//        return Jackson2JsonMessageConverter()
//    }
}
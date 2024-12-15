package me.uni.deliveryCentral.queue

import me.uni.deliveryCentral.model.Address
import me.uni.deliveryCentral.model.Dimensions
import me.uni.deliveryCentral.model.Order
import me.uni.deliveryCentral.model.Payment
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class OrderMessageSender() {
//    fun sendMessage(message: String) {
//        amqpTemplate.convertAndSend("orders", "order", Order(message.toLong(),
//            Address(1L, "a", 1, 2, "c", "a"),
//            Dimensions(1L, 5.56f, 1.23f, 3.12f, "M", "cm"),
//            Payment(1L, 22.99f, "PLN","1234")))
//        println("Message sent: $message");
//    }
}
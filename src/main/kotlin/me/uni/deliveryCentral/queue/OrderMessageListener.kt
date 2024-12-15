package me.uni.deliveryCentral.queue

import me.uni.deliveryCentral.model.Order
import org.springframework.stereotype.Service

@Service
class OrderMessageListener {

//    @RabbitListener(bindings = [QueueBinding(
//        value = Queue(value = "orderQueue", durable = "true"),
//        exchange = Exchange(value = "orders", ignoreDeclarationExceptions = "true"),
//        key = arrayOf("order")
//    )]
//    )
//    fun receiveMessageFromOrderQueue(orderMessage: Order) {
//        println("Otrzymano wiadomość!")
//        println(orderMessage.toString());
//        return
//    }
}
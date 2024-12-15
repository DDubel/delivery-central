package me.uni.deliveryCentral.controller


import me.uni.deliveryCentral.model.User
import me.uni.deliveryCentral.queue.OrderMessageSender
import me.uni.deliveryCentral.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val messageSender: OrderMessageSender,
                    private val userRepository: UserRepository) {

    @GetMapping("/user")
    fun send(@RequestParam message: String) {
        println("hello")
        userRepository.save(User(1, "1", "1", "1", "ROLE_USER"))
//        messageSender.sendMessage(message)
    }
}
package me.uni.deliveryCentral.controller


import me.uni.deliveryCentral.dto.UserDTO
import me.uni.deliveryCentral.model.User
import me.uni.deliveryCentral.queue.OrderMessageSender
import me.uni.deliveryCentral.repository.UserRepository
import me.uni.deliveryCentral.service.UserService
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*

@RestController
class UserController(private val messageSender: OrderMessageSender,
                    private val userService: UserService) {

    @GetMapping("/user")
    fun send(@RequestParam message: String) {
        println("hello")
        userService.createUser(User(1, "1", "1", "1", setOf("USER", "ADMIN")))
//        messageSender.sendMessage(message)
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping
    fun createUser(@RequestBody user: User): UserDTO {
        return UserDTO().ofUser(userService.createUser(user))
    }
}
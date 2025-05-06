package me.uni.deliveryCentral.service

import me.uni.deliveryCentral.model.User
import me.uni.deliveryCentral.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {
    private val passwordEncoder = BCryptPasswordEncoder()

    fun createUser(user: User) : User {
        user.password = passwordEncoder.encode(user.password);
        return userRepository.save(user);
    }

    fun findByUsername(username: String): User? {
        return userRepository.findByUsername(username)
    }
}
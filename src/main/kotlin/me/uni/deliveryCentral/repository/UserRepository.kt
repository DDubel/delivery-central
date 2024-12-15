package me.uni.deliveryCentral.repository

import me.uni.deliveryCentral.model.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: MongoRepository<User, String> {
}
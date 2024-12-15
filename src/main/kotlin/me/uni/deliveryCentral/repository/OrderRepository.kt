package me.uni.deliveryCentral.repository

import me.uni.deliveryCentral.model.Order
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface OrderRepository : MongoRepository<Order, Long> {
}
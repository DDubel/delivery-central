package me.uni.deliveryCentral.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "orders")
data class Order(
    @Id
    val id: Long,
    val userId: Long,
    val address: Address,
    val dimensions: Dimensions,
    val payment: Payment
)
{

}
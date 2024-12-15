package me.uni.deliveryCentral.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Order(
    val id: Long,
    val address: Address,
    val dimensions: Dimensions,
    val payment: Payment
)
{

}
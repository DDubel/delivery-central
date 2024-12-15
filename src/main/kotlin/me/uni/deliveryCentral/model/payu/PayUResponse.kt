package me.uni.deliveryCentral.model.payu

data class PayUResponse(
    val status: Status,
    val orderId: String,
    val redirectUri: String
)
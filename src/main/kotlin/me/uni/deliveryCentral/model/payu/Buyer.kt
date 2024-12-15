package me.uni.deliveryCentral.model.payu

data class Buyer(
    val email: String,
    val phone: String,
    val firstName: String,
    val lastName: String,
    val language: String
)
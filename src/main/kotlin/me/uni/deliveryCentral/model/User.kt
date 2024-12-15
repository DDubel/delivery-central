package me.uni.deliveryCentral.model

import org.springframework.data.mongodb.core.mapping.Document

@Document
data class User(
    val id: Long,
    val username: String,
    val email: String,
    val password: String,
    val role: String
) {

}
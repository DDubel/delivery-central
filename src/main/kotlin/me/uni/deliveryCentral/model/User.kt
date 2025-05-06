package me.uni.deliveryCentral.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
    @Transient
    val seqName: String,
    @Id
    val id: Long,
    val username: String,
    val email: String,
    var password: String,
    val role: Set<String>
) {
    constructor(id: Long, username: String, email: String, password: String, role: Set<String>):
            this("users_sequence", id, username, email, password, role)
}
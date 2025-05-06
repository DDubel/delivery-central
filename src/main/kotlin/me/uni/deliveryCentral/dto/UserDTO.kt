package me.uni.deliveryCentral.dto

import me.uni.deliveryCentral.model.User

class UserDTO(private var username: String, private var permissions: Set<String>) {

    constructor() : this("nothing", setOf("none"))
    fun ofUser(user: User): UserDTO {
        return UserDTO(user.username, user.role)
    }
}
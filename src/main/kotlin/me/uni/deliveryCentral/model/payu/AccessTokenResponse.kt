package me.uni.deliveryCentral.model.payu

data class AccessTokenResponse(
    val access_token: String,
    val token_type: String,
    val expires: Int
)

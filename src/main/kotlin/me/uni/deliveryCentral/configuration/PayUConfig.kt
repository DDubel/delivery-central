package me.uni.deliveryCentral.configuration

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration

@Configuration
class PayUConfig(
    @Value("\${payu.client_id}") val clientId: String,
    @Value("\${payu.client_secret}") val clientSecret: String,
    @Value("\${payu.url}") val url: String
)

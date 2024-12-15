package me.uni.deliveryCentral.model

data class Payment(
    val id: Long,
    val value: Float,
    val currency: String,
    val paymentId: String,
    val isDone: Boolean = false
) {

}

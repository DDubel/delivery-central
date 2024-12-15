package me.uni.deliveryCentral.model

data class Address(
    val id: Long,
    val street: String,
    val streetNum: Int,
    val apartment: Int?,
    val city: String,
    val postCode: String
) {

}

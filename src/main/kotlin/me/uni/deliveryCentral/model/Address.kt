package me.uni.deliveryCentral.model

data class Address(
    var street: String,
    var streetNum: Int,
    var apartment: Int?,
    var city: String,
    var postCode: String
) {

}

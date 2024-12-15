package me.uni.deliveryCentral.model.payu

data class PayURequest(
    val notifyUrl: String,
    val continueUrl: String,
    val customerIp: String,
    val merchantPosId: String,
    val description: String,
    val currencyCode: String,
    val totalAmount: String,
    val buyer: Buyer,
    val products: List<Product>
)

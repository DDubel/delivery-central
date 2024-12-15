package me.uni.deliveryCentral.controller

import me.uni.deliveryCentral.model.payu.Buyer
import me.uni.deliveryCentral.model.payu.PayURequest
import me.uni.deliveryCentral.model.payu.PayUResponse
import me.uni.deliveryCentral.model.payu.Product
import me.uni.deliveryCentral.service.payment.PayUOrderService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payment")
class PaymentController(private val payUOrderService: PayUOrderService) {

    @PostMapping("/create")
    fun createPayment(@RequestBody orderDetails: String): String {
        val response = payUOrderService.createPayment(
            PayURequest(
                "http://www.moj-sklep.pl/notfiy",
                "http://www.moj-sklep.pl/continue",
                "127.0.0.1",
                "485128",
                "Order ".plus(orderDetails),
                "PLN",
                "1999",
                Buyer(
                    "nieistnieje@nieistnieje.com",
                    "111-111-1111",
                    "Ja",
                    "Jakiś",
                    "pl"
                ),
                listOf(
                    Product(
                    "Przesyłka",
                        "2555",
                        "1"
                )
                )
            )
        )

        return response!!.redirectUri
    }
}
package me.uni.deliveryCentral.service.payment

import me.uni.deliveryCentral.configuration.PayUConfig
import me.uni.deliveryCentral.model.payu.PayURequest
import me.uni.deliveryCentral.model.payu.PayUResponse
import org.springframework.http.*
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class PayUOrderService(private val restTemplate: RestTemplate, private val payUAuthService: PayUAuthService,
                       private val payUConfig: PayUConfig
) {

    fun createPayment(request: PayURequest): PayUResponse? {
        val accessTokenResponse = payUAuthService.obtainAccessToken(payUConfig.clientId, payUConfig.clientSecret)
        val url = "https://secure.snd.payu.com/api/v2_1/orders"

        // Ustawienie nagłówków (np. typ zawartości i token autoryzacyjny)
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_JSON
        headers.set("Authorization", "Bearer ".plus(accessTokenResponse))

        // Tworzenie obiektu żądania z nagłówkami i treścią
        val entity = HttpEntity(request, headers)

        // Wysyłanie zapytania
        val response: ResponseEntity<PayUResponse> = restTemplate.exchange(
            url,
            HttpMethod.POST,
            entity,
            PayUResponse::class.java
        )

        return response.body
    }

}
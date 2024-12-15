package me.uni.deliveryCentral.service.payment

import me.uni.deliveryCentral.configuration.PayUConfig
import org.springframework.http.*
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange
import org.springframework.web.util.UriComponentsBuilder

@Service
class PayUAuthService(private val restTemplate: RestTemplate, private val payUConfig: PayUConfig) {
    fun obtainAccessToken(clientId: String, clientSecret: String): String? {
        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_FORM_URLENCODED
        headers.setBasicAuth(payUConfig.clientId, payUConfig.clientSecret)

        val uri = UriComponentsBuilder
            .fromHttpUrl(payUConfig.url)
            .queryParam("grant_type", "client_credentials")
            .toUriString()

        val entity = HttpEntity<String>(headers)

        val response = restTemplate.exchange<Map<String, Any>>(
            uri,
            HttpMethod.POST,
            entity,
            Map::class.java
        )

        return if (response.statusCode == HttpStatus.OK) {
            response.body?.get("access_token") as String?
        } else {
            null
        }
    }
}
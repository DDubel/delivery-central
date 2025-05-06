package me.uni.deliveryCentral.model.counter

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "database_sequences")
data class DatabaseSequences(
    @Id
    private val id: String,
    private val seq: Long
) {

}
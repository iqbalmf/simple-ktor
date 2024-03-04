package net.iqbalfauzan.data.model

import kotlinx.serialization.Serializable

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.data.model
 */
@Serializable
data class Rabbit(
    val name: String,
    val description: String,
    val imageUrl: String,
)

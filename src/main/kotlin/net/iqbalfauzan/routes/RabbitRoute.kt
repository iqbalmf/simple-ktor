package net.iqbalfauzan.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.iqbalfauzan.data.model.Rabbit

/**
 * Created by IqbalMF on 2024.
 * Package net.iqbalfauzan.routes
 */

private const val BASE_URL = "http://localhost:8082"
private val rabbits = listOf(
    Rabbit("Carl", "A cute brown rabbit", "$BASE_URL/rabbits/rabbit1.jpeg"),
    Rabbit("Emma", "Emma likes to eat apples", "$BASE_URL/rabbits/rabbit2.jpeg"),
    Rabbit("Florian", "Florian is always hungry", "$BASE_URL/rabbits/rabbit3.jpeg"),
    Rabbit("Federico", "Federico likes to climb mountains", "$BASE_URL/rabbits/rabbit4.jpeg"),
    Rabbit("Gina", "Gina is a true beauty", "$BASE_URL/rabbits/rabbit5.jpeg"),
)

fun Route.randomRabbit() {
    get("/random-rabbit") {
        call.respond(
            HttpStatusCode.OK, rabbits.random()
        )
    }
}
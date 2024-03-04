package net.iqbalfauzan.plugins

import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import net.iqbalfauzan.routes.randomRabbit

fun Application.configureRouting() {
    routing {
        randomRabbit()
        // Static plugin. Try to access `/static/index.html`
        staticResources("/", "static"){
            default("index.html")
        }
    }
}

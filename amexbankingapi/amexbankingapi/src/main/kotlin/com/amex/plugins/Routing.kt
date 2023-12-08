package com.amex.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/customers") {
            call.respondText("Loading Customers.....")
        }
    }
}

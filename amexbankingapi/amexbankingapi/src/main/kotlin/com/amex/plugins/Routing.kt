package com.amex.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        route("/customers"){
            get {
                call.respondText("Loading Customers.....")
            }
            post {
                call.respondText("Sending Customers.....")
            }
            put {
                call.respondText("Updating Customers.....")
            }
            delete {
                call.respondText("Deleting Customers.....")
            }
        }

    }
}

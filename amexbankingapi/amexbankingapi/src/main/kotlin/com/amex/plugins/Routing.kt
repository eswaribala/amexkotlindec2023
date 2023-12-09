package com.amex.plugins

import com.amex.dao.IndividualSubSystem
import com.amex.dtos.ResponseWrapper
import com.amex.models.Customer
import com.amex.models.Individual
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

var dao=IndividualSubSystem()
fun Application.configureRouting() {
    routing {
        route("/customers"){
            get {
                call.respondText("Loading Customers.....")
            }
            post {
                var individual=call.receive<Individual>()
                if(dao.addIndividual(individual)) {
                    call.response.status(HttpStatusCode.OK)
                    call.respond(individual)
                }
                else {
                    call.response.status(HttpStatusCode.BadRequest)
                    call.respond("Object Not added")
                }

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

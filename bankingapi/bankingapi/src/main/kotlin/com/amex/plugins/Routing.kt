package com.amex.plugins

import com.amex.dao.DAOFacadeDatabase
import com.amex.models.Employee
import io.ktor.http.*
import io.ktor.http.cio.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.parameters.RequestBody


val dao = DAOFacadeDatabase()
fun Application.configureRouting() {
   routing {
        get("/customers") {
            call.respondText("Rocking Ktor!")
        }


       route("/employees") {
          /* get {
               call.respond(dao.getAllEmployees())
           }*/

           post<Employee>{
               val employee = call.receive<Employee>()
               val emp = call.receive<Employee>()
               dao.createEmployee(emp.name, emp.email, emp.city)
               call.response.status(HttpStatusCode.OK)
               call.respond(emp.name)
           }

          /* put {
               val emp = call.receive<Employee>()
               dao.updateEmployee(emp.id, emp.name, emp.email, emp.city)
           }
           delete("/{id}") {
               val id = call.parameters["id"]
               if (id != null)
                   dao.deleteEmployee(id.toInt())
           }*/


       }


    }

}
@kotlinx.serialization.Serializable
@Schema(description = "Model for Employee.")
data class Employee(@field:Schema(
    description = "Id",
    example = "1999",
    type = "int",
    minimum = "1900",
    maximum = "2500"
)val id: Int, val name: String,
                    val email: String, val city: String)
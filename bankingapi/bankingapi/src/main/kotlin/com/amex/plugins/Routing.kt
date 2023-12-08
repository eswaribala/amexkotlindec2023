package com.amex.plugins

import com.amex.dao.DAOFacadeDatabase
import com.amex.models.Employee
import io.ktor.http.*
import io.ktor.http.cio.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*



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
           post {

               val emp = call.receive<Employee>()
               dao.createEmployee(emp.name, emp.email, emp.city)
               call.response.status(HttpStatusCode.OK)
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

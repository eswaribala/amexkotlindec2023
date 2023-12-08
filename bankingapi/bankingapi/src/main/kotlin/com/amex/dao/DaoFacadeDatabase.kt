package com.amex.dao

import com.amex.facades.DAOFacade
import com.amex.models.Employee
import kotlin.random.Random


class DAOFacadeDatabase: DAOFacade {
    private var employeesList:MutableList<Employee> = mutableListOf<Employee>()
    override fun createEmployee(name: String, email: String, city: String){
    employeesList.add(Employee(Random.nextInt(1,100),name,email,city))
    }

}
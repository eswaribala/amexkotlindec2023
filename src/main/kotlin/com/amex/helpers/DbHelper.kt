package com.amex.helpers

import com.amex.bankingapp.exceptions.PasswordNotFound
import com.amex.bankingapp.exceptions.ResourceNotFound
import com.amex.bankingapp.exceptions.UrlNotFound
import com.amex.exceptions.UserNameNotFoundException
import java.sql.Connection
import java.sql.DriverManager
import java.util.*

object DbHelper {

    val url: String?

    val userName: String?
    val password: String?
    val driver: String?
    internal var conn: Connection? = null

    init {
        val resource = ResourceBundle.getBundle("db")

        url = resource.getString("url")
        if(url==null){
            throw UrlNotFound()
        }
        try {
            userName = resource.getString("username")
        }
        catch(missing:MissingResourceException){
            throw ResourceNotFound()
        }
        if(userName.length == 0){
            throw UserNameNotFoundException("User Name Not found")
        }
        password = resource.getString("password")
        if(password==null){
            throw PasswordNotFound()
        }
        driver=resource.getString("driver")
    }
    fun getConnection(): Connection? {
        Class.forName(driver)
        return DriverManager.getConnection(url,userName, password)
    }

}
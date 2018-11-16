package com.hmtmcse.gstester

class Department {

    Integer id
    String name
    String description
    Date lastUpdated
    Date dateCreated

    static hasMany = [student: Student]


    static constraints = {
    }
}

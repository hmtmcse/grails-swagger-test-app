package com.hmtmcse.gstester

class Student {

    Integer id
    String name
    String email
    String password
    Date lastUpdated
    Date dateCreated
    Department department


    static hasMany = [course: Course]

    static constraints = {
        department(nullable: true)
    }

}

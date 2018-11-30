package com.hmtmcse.gstester

class Student {

    Integer id
    Long nationalIdNumber
    String name
    String identification
    String email
    String uuid
    String password
    Date lastUpdated
    Date dateCreated
    Department department


    static hasMany = [course: Course]

    static constraints = {
        department(nullable: true)
    }

    def beforeInsert (){
        this.password = this.password.encodeAsMD5()
    }

    def beforeValidate(){
        this.uuid = AppUtil.uuid()
    }

}

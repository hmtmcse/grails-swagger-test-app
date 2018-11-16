package com.hmtmcse.gstester

class Student {

    Integer id
    String name
    String email
    String uuid
    String password
    Date lastUpdated
    Date dateCreated
    Department department


    static hasMany = [course: Course]

    static constraints = {
        department(nullable: true)
        uuid(nullable: true)
    }

    def beforeInsert (){
        this.password = this.password.encodeAsMD5()
        this.uuid = AppUtil.uuid()
    }

}

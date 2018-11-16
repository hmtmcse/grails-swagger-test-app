package com.hmtmcse.gstester

class Department {

    Integer id
    String name
    String uuid
    String description
    Date lastUpdated
    Date dateCreated

    static hasMany = [student: Student]


    static constraints = {
    }

    def beforeInsert (){
        this.uuid = AppUtil.uuid()
    }
}

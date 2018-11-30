package com.hmtmcse.gstester

class Department {

    Integer id
    String name
    String displayName
    String uuid
    String description
    Date lastUpdated
    Date dateCreated

    static hasMany = [student: Student]


    static constraints = {
        description(nullable: true)
    }

    def beforeValidate (){
        this.uuid = AppUtil.uuid()
    }
}

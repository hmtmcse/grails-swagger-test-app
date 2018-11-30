package com.hmtmcse.gstester

class Course {

    Integer id
    String name
    String code
    String uuid
    Date lastUpdated
    Date dateCreated

    static belongsTo = Student
    static hasMany = [student: Student]

    static constraints = {
    }

    def beforeValidate(){
        this.uuid = AppUtil.uuid()
    }
}

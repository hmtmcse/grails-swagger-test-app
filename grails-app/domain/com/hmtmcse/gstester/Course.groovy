package com.hmtmcse.gstester

class Course {

    Integer id
    String name
    String code
    Date lastUpdated
    Date dateCreated

    static belongsTo = Student
    static hasMany = [student: Student]

    static constraints = {
    }
}

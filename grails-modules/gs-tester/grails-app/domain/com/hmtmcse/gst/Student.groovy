package com.hmtmcse.gst

import com.hmtmcse.gcommon.DomainTask
import grails.gorm.MultiTenant

class Student implements MultiTenant<Student>, DomainTask {

    Integer id
    Boolean isActive = true
    Boolean isDeleted = false
    Date dateCreated
    Date lastUpdated
    String uuid

    String nId
    String name
    String studentId
    String email
    String password
    Department department


    static hasMany = [course: Course]

    static constraints = {
        department(nullable: true)
    }

    def beforeInsert() {
        this.password = this.password.encodeAsSHA1()
    }


}

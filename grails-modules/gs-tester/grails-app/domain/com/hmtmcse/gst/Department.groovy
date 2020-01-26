package com.hmtmcse.gst

import com.hmtmcse.gcommon.DomainTask
import grails.gorm.MultiTenant

class Department implements MultiTenant<Department>, DomainTask {

    Integer id
    Boolean isActive = true
    Boolean isDeleted = false
    Date dateCreated
    Date lastUpdated
    String uuid

    String name
    String displayName
    String description

    static hasMany = [student: Student]


    static constraints = {
        description(nullable: true)
    }

}

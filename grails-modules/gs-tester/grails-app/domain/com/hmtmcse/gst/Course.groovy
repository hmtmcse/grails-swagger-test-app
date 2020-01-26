package com.hmtmcse.gst

import com.hmtmcse.gcommon.DomainTask
import grails.gorm.MultiTenant

class Course implements MultiTenant<Course>, DomainTask {

    Integer id
    Boolean isActive = true
    Boolean isDeleted = false
    Date dateCreated
    Date lastUpdated
    String uuid

    String name
    String code


    static belongsTo = [Student]
    static hasMany = [student: Student]

    static constraints = {}

}

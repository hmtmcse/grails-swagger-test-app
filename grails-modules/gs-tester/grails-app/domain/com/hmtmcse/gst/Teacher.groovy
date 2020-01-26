package com.hmtmcse.gst

import com.hmtmcse.gcommon.DomainTask
import grails.gorm.MultiTenant

class Teacher implements MultiTenant<Teacher>, DomainTask {

    Integer id
    Boolean isActive = true
    Boolean isDeleted = false
    Date dateCreated
    Date lastUpdated
    String uuid

    String name


    static constraints = {}


}

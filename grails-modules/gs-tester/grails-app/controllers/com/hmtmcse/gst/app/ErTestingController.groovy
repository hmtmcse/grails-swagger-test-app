package com.hmtmcse.gst.app

import com.hmtmcse.er.ErTestingService
import com.hmtmcse.gst.Course
import com.hmtmcse.gst.Department
import com.hmtmcse.gst.Student
import grails.converters.JSON

class ErTestingController {

    ErTestingService erTestingService

    def index() {

    }

    def course() {
        def list = Course.createCriteria().list {}
        render(list as JSON)
    }

    def student() {
        def list = Student.createCriteria().list {
            order("department", "asc")
        }
        render(list as JSON)
    }



    def department() {
        render(Department.list() as JSON)
    }

}

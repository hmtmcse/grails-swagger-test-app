package com.hmtmcse.er

import com.hmtmcse.gstester.Course
import com.hmtmcse.gstester.Department
import com.hmtmcse.gstester.Student
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

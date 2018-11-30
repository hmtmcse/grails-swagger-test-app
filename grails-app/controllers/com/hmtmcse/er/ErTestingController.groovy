package com.hmtmcse.er

import com.hmtmcse.gstester.Course
import com.hmtmcse.gstester.Department
import com.hmtmcse.gstester.Student
import grails.converters.JSON

class ErTestingController {

    ErTestingService erTestingService

    def index() {
        def studentMap = [
                "rollNumber"    : 1000,
                "name"          : "Touhid",
                "identification": "t-001",
                "email"         : "t@email.com",
                "password"      : "123456",
                "department"    : 1,
        ]


        def studentDepartmentMap = [
                "rollNumber"    : 1000,
                "name"          : "Touhid",
                "identification": "t-001",
                "email"         : "t@email.com",
                "password"      : "123456",
                "department"    : [
                        'name'       : 'ABC',
                        'displayName': 'ABC Display'
                ],
        ]

        def studentCourseMap = [
                "rollNumber"    : 1000,
                "name"          : "Touhid",
                "identification": "t-001",
                "email"         : "t@email.com",
                "password"      : "123456",
                "course"    : [1, 2],
        ]

        Student student = new Student(studentCourseMap)
        student.save(flush:true)
        render(student as JSON)
    }

    def course() {
        def courses = [
                ["name": "Mathematics", "code": "M1"],
                ["name": "Java Programming", "code": "JP"],
                ["name": "Structural Programming", "code": "SP"],
                ["name": "Data Structure", "code": "DS"]
        ]

        if(Course.count() == 0){
            def courseDomain = new Course(name: "Digital Electronic", code: "DE").save(flush: true)
            courses.each { course ->
                courseDomain = new Course(course).save(flush: true)
                println(courseDomain)
            }
        }
        def list = Course.createCriteria().list {}
        render(list as JSON)
    }

    def student() {
        def list = Student.createCriteria().list {};
        render(list as JSON)
    }



    def department() {
        render(Department.list() as JSON)
    }

}

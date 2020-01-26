package com.hmtmcse.gst.app

import com.hmtmcse.er.ErTestingService
import com.hmtmcse.gst.Course
import com.hmtmcse.gst.Department
import com.hmtmcse.gst.Student
import grails.converters.JSON
import grails.gorm.transactions.Transactional

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

    @Transactional
    def manyToMany(){
        Student student = new Student(
                name: "name",
                "nId": 123,
                "password": "password",
                studentId: "studentId",
                email: "email")
        student.addToCourse(Course.get(2))
        student.save()
        render(["abc": "abc"] as JSON)
    }

    @Transactional
    def manyToMany2(){
        Course course = new Course(name: "Name", code: "code")
        course.addToStudent(Student.get(2))
        course.save()
        render(["course": "course"] as JSON)
    }


}

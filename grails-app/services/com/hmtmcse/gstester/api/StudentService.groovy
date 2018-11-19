package com.hmtmcse.gstester.api

import com.hmtmcse.gstester.Student


class StudentService {

    def save(def params) {
        Student student = new Student(params)
        return student.save(flush: true)

    }
}

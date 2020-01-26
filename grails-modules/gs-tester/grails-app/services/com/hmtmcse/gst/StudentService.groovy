package com.hmtmcse.gst

import com.hmtmcse.gst.Student


class StudentService {

    def save(def params) {
        Student student = new Student(params)
        return student.save(flush: true)

    }
}

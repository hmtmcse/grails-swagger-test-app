package com.hmtmcse.gstester.api

import com.hmtmcse.gstester.Course
import com.hmtmcse.gstester.Department
import com.hmtmcse.gstester.Student


class DataInitService {


    static iniAll() {

        def departments = [
                [name: "CSE", displayName: "Computer Science & Engineering"],
                [name: "EEE", displayName: "Electrical & Electronic Engineering"],
                [name: "TE", displayName: "Textile Engineering"]
        ]

        if (Department.count == 0) {
            departments.each { department ->
                new Department(department).save(flush: true)
            }
        }


        def courses = [
                ["name": "Mathematics", "code": "M1"],
                ["name": "Java Programming", "code": "JP"],
                ["name": "Structural Programming", "code": "SP"],
                ["name": "Data Structure", "code": "DS"],
                [name: "Digital Electronic", code: "DE"]
        ]
        if (Course.count() == 0) {
            courses.each { course ->
                new Course(course).save(flush: true)
            }
        }

        def students = [
                [name: "Touhid Mia", identification: "13", email: "hmtm.cse@email.local", password: "123456", "course": [1, 2], "nationalIdNumber": 1000, department: Department.findByName("CSE")],
                [name: "Masumul Hassan", identification: "1", email: "masumul@email.local", password: "123456", "course": [3, 4], "nationalIdNumber": 1001, department: Department.findByName("CSE")],
                [name: "Erfan", identification: "2", email: "erfan@email.local", password: "123456", "course": [5, 1], "nationalIdNumber": 1002, department: Department.findByName("CSE")],

                [name: "Jodu", identification: "20", email: "jodu@email.local", password: "123456", "course": [1, 5], "nationalIdNumber": 1003, department: Department.findByName("EEE")],
                [name: "Modu", identification: "21", email: "modu@email.local", password: "123456", "course": [2, 3], "nationalIdNumber": 1004, department: Department.findByName("EEE")],
                [name: "Kodu", identification: "22", email: "kodu@email.local", password: "123456", "course": [1, 2], "nationalIdNumber": 1005, department: Department.findByName("EEE")],

                [name: "Bristi", identification: "40", email: "bristi@email.local", password: "123456", "course": [4, 2], "nationalIdNumber": 1006, department: Department.findByName("TE")],
                [name: "Badol", identification: "41", email: "badol@email.local", password: "123456", "course": [5, 1], "nationalIdNumber": 1007, department: Department.findByName("TE")],
                [name: "Nodi", identification: "42", email: "nodi@email.local", password: "123456", "course": [1, 2], "nationalIdNumber": 1008, department: Department.findByName("TE")],
        ]

        if (Student.count() == 0) {
            students.each { student ->
                new Student(student).save(flush: true)
            }
        }
    }
}

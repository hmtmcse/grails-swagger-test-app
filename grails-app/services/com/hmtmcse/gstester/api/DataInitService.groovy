package com.hmtmcse.gstester.api

import com.hmtmcse.gstester.Department
import com.hmtmcse.gstester.Student


class DataInitService {


    static iniAll() {
        new Department(name: "CSE", displayName: "Computer Science & Engineering").save(flush: true)
        new Department(name: "EEE", displayName: "Electrical & Electronic Engineering").save(flush: true)
        new Department(name: "TE", displayName: "Textile Engineering ").save(flush: true)

        new Student(name: "Touhid Mia", identification: "13", email: "hmtm.cse@email.local", password: "123456", department: Department.findByName("CSE")).save()
        new Student(name: "Masumul Hassan", identification: "1", email: "masumul@email.local", password: "123456", department: Department.findByName("CSE")).save()
        new Student(name: "Erfan", identification: "2", email: "erfan@email.local", password: "123456", department: Department.findByName("CSE")).save()

        new Student(name: "Jodu", identification: "20", email: "jodu@email.local", password: "123456", department: Department.findByName("EEE")).save()
        new Student(name: "Modu", identification: "21", email: "modu@email.local", password: "123456", department: Department.findByName("EEE")).save()
        new Student(name: "Kodu", identification: "22", email: "kodu@email.local", password: "123456", department: Department.findByName("EEE")).save()

        new Student(name: "Bristi", identification: "40", email: "bristi@email.local", password: "123456", department: Department.findByName("TE")).save()
        new Student(name: "Badol", identification: "41", email: "badol@email.local", password: "123456", department: Department.findByName("TE")).save()
        new Student(name: "Nodi", identification: "42", email: "nodi@email.local", password: "123456", department: Department.findByName("TE")).save()
    }
}

package com.hmtmcse.gstester

class Teacher {

    Integer id
    String uuid

    static constraints = {
    }

    def beforeValidate(){
        this.uuid = AppUtil.uuid()
    }
}

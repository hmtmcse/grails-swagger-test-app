package com.hmtmcse.gstester.api

import com.hmtmcse.gs.GsRestProcessor

class ApiStudentV2Controller extends GsRestProcessor {

    StudentApiDefinitionService studentApiDefinitionService


    def postCreate(){
        return create(studentApiDefinitionService.createStudent())
    }

    def getList(){
        return list(studentApiDefinitionService.getStudentList())
    }


    def postList(){
        return list(studentApiDefinitionService.postStudentList())
    }

    def getDetails(){
        return details(studentApiDefinitionService.getDetails())
    }

    def postDetails(){
        return details(studentApiDefinitionService.getDetails())
    }

    def postUpdate(){
        return update(studentApiDefinitionService.update())
    }

    def deleteDelete(){
        return delete(studentApiDefinitionService.delete())
    }
}

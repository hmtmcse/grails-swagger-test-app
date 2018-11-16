package com.hmtmcse.gstester.api

import com.hmtmcse.gs.GsRestProcessor

class ApiStudentV2Controller extends GsRestProcessor {

    StudentApiDefinitionService studentApiDefinitionService


    def postCreate(){
        return create(studentApiDefinitionService.createStudent())
    }

    def getList(){
        return list(studentApiDefinitionService.list())
    }


    def postList(){
        return list(studentApiDefinitionService.list())
    }

    def getDetails(){
        return details(studentApiDefinitionService.details())
    }

    def postDetails(){
        return details(studentApiDefinitionService.details())
    }


    def postUpdate(){
        return update(studentApiDefinitionService.update())
    }


    def deleteDelete(){
        return delete(studentApiDefinitionService.delete())
    }
}

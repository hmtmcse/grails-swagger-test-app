package com.hmtmcse.gst.api

import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.gst.definition.DepartmentApiDefinitionService

class ApiDepartmentV2Controller extends GsRestProcessor {

    DepartmentApiDefinitionService departmentApiDefinitionService


    def postCreate(){
        return create(departmentApiDefinitionService.createDepartment())
    }

    def getList(){
        return list(departmentApiDefinitionService.list())
    }


    def postList(){
        return list(departmentApiDefinitionService.list())
    }

    def getDetails(){
        return details(departmentApiDefinitionService.details())
    }

    def postDetails(){
        return details(departmentApiDefinitionService.details())
    }


    def postUpdate(){
        return update(departmentApiDefinitionService.update())
    }


    def deleteDelete(){
        return delete(departmentApiDefinitionService.delete())
    }

}

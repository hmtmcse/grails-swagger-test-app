package com.hmtmcse.gst.api

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.gs.data.GsApiResponseData
import com.hmtmcse.gst.Student
import com.hmtmcse.gst.definition.StudentDefinitionService

class ApiStudentV1Controller extends GsRestProcessor {

    StudentDefinitionService studentDefinitionService

    def postCreate(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addRequestProperty("name")
        definition.addRequestProperty("email")
        definition.addRequestProperty("password")
        definition.addRequestProperty("studentId")
        definition.addRequestProperty("course")
        definition.addRequestProperty("nId")
        definition.addResponseProperty("uuid")
        definition.successResponseAsData()
        return create(definition)
    }


    def getList(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeAllPropertyToResponse()
        definition.addRelationalEntityResponse("department")
        definition.reResponseData().addResponseProperty("displayName")
        definition.reResponseData().addResponseProperty("uuid")
        definition.includeAllPropertyToWhereFilter()
        definition.successResponseAsData()
        return list(definition)
    }


    def postList(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeAllPropertyToResponse()
        definition.addRelationalEntityResponse("department")
        definition.reResponseData().addResponseProperty("displayName")
        definition.reResponseData().addResponseProperty("uuid")
        definition.includeAllPropertyToWhereFilter()
        definition.successResponseAsData()
        return list(definition)
    }

    def getDetails(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeInResponse(["name", "email", "id"])
        definition.addResponseProperty("identification")
        definition.addResponseProperty("uuid")
        definition.includeAllPropertyToWhereFilter()
        definition.successResponseAsData()
        return details(definition)
    }

    def postDetails(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeInResponse(["name", "email", "id"])
        definition.addResponseProperty("identification")
        definition.addResponseProperty("uuid")
        definition.includeAllPropertyToWhereFilter()
        definition.successResponseAsData()
        return details(definition)
    }


    def postUpdate(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addRequestProperty("email")
        definition.addRequestProperty("name")
        definition.addToWhereFilterProperty("id")
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Updated")
        return update(definition)
    }


    def deleteDelete(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addToWhereFilterProperty("id")
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Deleted")
        return delete(definition)
    }


    def getCount(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        return count(definition)
    }

    def postCustom(){
        return customProcessor(studentDefinitionService.custom())
    }

}

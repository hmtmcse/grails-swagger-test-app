package com.hmtmcse.gstester.api

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.data.GsApiResponseData
import com.hmtmcse.gstester.Student


class StudentApiDefinitionService {


    GsApiActionDefinition getStudentList(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeOnlyProperty(["name", "email", "id"])
        return definition
    }

    GsApiActionDefinition postStudentList(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeOnlyProperty(["name", "email", "id"])
        return definition
    }

    GsApiActionDefinition createStudent(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addRequestProperty("name").setIsRequired()
        definition.addRequestProperty("email").setIsRequired()
        definition.addRequestProperty("password").setIsRequired()
        definition.addResponseProperty("uuid")
        definition.successResponseAsMap()
        return definition
    }

    GsApiActionDefinition getDetails(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeOnlyProperty(["name", "email", "id"])
        return definition
    }

    GsApiActionDefinition update(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addRequestProperty("email")
        definition.addRequestProperty("name")
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Updated")
        return definition
    }

    GsApiActionDefinition delete(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Deleted")
        return definition
    }
    
}

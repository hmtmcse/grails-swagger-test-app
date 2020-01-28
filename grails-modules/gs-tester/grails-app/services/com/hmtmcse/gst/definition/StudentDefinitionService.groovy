package com.hmtmcse.gst.definition

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.data.ApiHelper
import com.hmtmcse.gs.data.GsApiResponseData
import com.hmtmcse.gs.data.GsParamsPairData
import com.hmtmcse.gs.model.CustomProcessor
import com.hmtmcse.gst.Student
import com.hmtmcse.gst.StudentService


class StudentDefinitionService {

    StudentService studentService

    GsApiActionDefinition custom(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addRequestProperty("name")
        definition.addRequestProperty("email")
        definition.addRequestProperty("password")
        definition.addRequestProperty("studentId")
        definition.customProcessor = new CustomProcessor() {
            @Override
            GsApiResponseData process(GsApiActionDefinition actionDefinition, GsParamsPairData paramData, ApiHelper apiHelper) {
                def result =  studentService.save(paramData.params)
                return apiHelper.help.responseToApi(actionDefinition, result)
            }
        }
        definition.addResponseProperty("name")
        definition.addResponseProperty("uuid")
        definition.addResponseProperty("identification")
        definition.addResponseProperty("id")
        definition.successResponseAsData()
        return definition
    }

    GsApiActionDefinition create(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addRequestProperty("name")
        definition.addRequestProperty("email")
        definition.addRequestProperty("password")
        definition.addRequestProperty("studentId")
        definition.addRequestProperty("course")
        definition.addRequestProperty("nId")
        definition.addResponseProperty("uuid")
        definition.successResponseAsData()
        return definition
    }
}

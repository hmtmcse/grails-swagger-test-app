package com.hmtmcse.gst.definition

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.data.ApiHelper
import com.hmtmcse.gs.data.GsApiResponseData
import com.hmtmcse.gs.data.GsParamsPairData
import com.hmtmcse.gs.model.CustomProcessor
import com.hmtmcse.gst.Course
import com.hmtmcse.gst.Student


class CourseDefinitionService {


    GsApiActionDefinition create(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Course>(Course)
        definition.addRequestProperty("name").required()
        definition.addRequestProperty("code").required()
        definition.addRequestProperty("student")
        return definition
    }

    GsApiActionDefinition custom(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Course>(Course)
        definition.addRequestProperty("name").required()
        definition.addRequestProperty("code").required()
        definition.customProcessor = new CustomProcessor() {
            @Override
            GsApiResponseData process(GsApiActionDefinition actionDefinition, GsParamsPairData paramData, ApiHelper apiHelper) {
                println(paramData.params)
               Course.withNewTransaction {
                   Course course = new Course(paramData.rawParams.gsApiData)
                   course.addToStudent(Student.get(paramData.rawParams.gsApiData.student))
                   course.save()
                   println("abc")
               }
                return [:]
            }
        }
        return definition
    }
}

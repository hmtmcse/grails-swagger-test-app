package com.hmtmcse.gst.api

import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.gst.Course
import com.hmtmcse.gst.definition.CourseDefinitionService

class ApiCourseV1Controller extends GsRestProcessor {

    CourseDefinitionService courseDefinitionService

    def postCreate() {
       return Course.withNewTransaction {
        return create(courseDefinitionService.create())
       }
    }

    def postCustom() {
        return customProcessor(courseDefinitionService.custom())
    }


}

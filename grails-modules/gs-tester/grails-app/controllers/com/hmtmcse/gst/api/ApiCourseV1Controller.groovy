package com.hmtmcse.gst.api

import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.gst.definition.CourseDefinitionService

class ApiCourseV1Controller extends GsRestProcessor {

    CourseDefinitionService courseDefinitionService

    def postCreate() {
       return create(courseDefinitionService.create())
    }


}

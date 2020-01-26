package com.hmtmcse.gst.definition

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gst.Course


class CourseDefinitionService {


    GsApiActionDefinition create(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Course>(Course)
        definition.addRequestProperty("name").required()
        definition.addRequestProperty("code").required()
        definition.addRequestProperty("student")
        return definition
    }

}

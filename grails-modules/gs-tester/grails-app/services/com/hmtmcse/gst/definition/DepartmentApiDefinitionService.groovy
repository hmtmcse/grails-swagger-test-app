package com.hmtmcse.gst.definition

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.data.GsApiResponseData
import com.hmtmcse.gst.Department

class DepartmentApiDefinitionService {



    private GsApiActionDefinition readDefinition(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.includeInResponse(["name", "displayName", "description"])
        return definition
    }


    GsApiActionDefinition list(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.includeAllPropertyToResponse()
        definition.addRelationalEntityResponse("student")
        definition.reResponseData().addResponseProperty("id")
        definition.includeAllPropertyToWhereFilter()
        definition.successResponseAsData()
        return definition
    }


    GsApiActionDefinition createDepartment(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.addRequestProperty("name")
        definition.addRequestProperty("displayName")
        definition.addRequestProperty("description")
        definition.addResponseProperty("uuid")
        definition.successResponseAsData()
        return definition
    }


    GsApiActionDefinition details(){
        GsApiActionDefinition definition = readDefinition()
        definition.addResponseProperty("uuid")
        definition.includeAllPropertyToWhereFilter()
        definition.successResponseAsData()
        return definition
    }


    GsApiActionDefinition update(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.addRequestProperty("name")
        definition.addRequestProperty("displayName")
        definition.addToWhereFilterProperty("id")
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Updated")
        return definition
    }


    GsApiActionDefinition delete(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.addToWhereFilterProperty("id")
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Deleted")
        return definition
    }

    
}

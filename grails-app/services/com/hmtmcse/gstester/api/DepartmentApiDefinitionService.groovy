package com.hmtmcse.gstester.api

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.data.ApiHelper
import com.hmtmcse.gs.data.GsApiResponseData
import com.hmtmcse.gs.data.GsParamsPairData
import com.hmtmcse.gs.model.CustomProcessor
import com.hmtmcse.gstester.Department


class DepartmentApiDefinitionService {



    private GsApiActionDefinition readDefinition(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.includeInResponse(["name", "displayName", "description"])
        return definition
    }


    GsApiActionDefinition list(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.includeAllThenExcludeFromResponse(['id', 'lastUpdated', 'dateCreated', 'student'])
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
        definition.successResponseAsData()
        return definition
    }


    GsApiActionDefinition update(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.addRequestProperty("name")
        definition.addRequestProperty("displayName")
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Updated")
        return definition
    }


    GsApiActionDefinition delete(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Department>(Department)
        definition.successResponseFormat = GsApiResponseData.successMessage("Successfully Deleted")
        return definition
    }

    
}

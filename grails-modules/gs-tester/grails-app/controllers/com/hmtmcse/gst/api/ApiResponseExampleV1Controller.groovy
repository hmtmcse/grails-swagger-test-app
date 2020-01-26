package com.hmtmcse.gst.api

import com.hmtmcse.gs.GsApiActionDefinition
import com.hmtmcse.gs.GsRestProcessor
import com.hmtmcse.gs.data.GsApiResponseProperty
import com.hmtmcse.gs.model.CustomResponseParamProcessor
import com.hmtmcse.gst.Student

class ApiResponseExampleV1Controller extends GsRestProcessor {

    def getIncludeInResponse() {
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeInResponse(["nationalIdNumber", "name", "email"])
        definition.successResponseAsData()
        return list(definition)
    }


    def getExcludeFromResponse() {
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeAllPropertyToResponse()
        definition.excludeFromResponse(["password", "id", "lastUpdated", "dateCreated"])
        definition.successResponseAsData()
        return list(definition)
    }

    def getIncludeAllPropertyToResponse() {
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeAllPropertyToResponse()
        definition.successResponseAsData()
        return list(definition)
    }

    def getIncludeAllThenExcludeFromResponse() {
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeAllThenExcludeFromResponse(["password", "id", "lastUpdated", "dateCreated"])
        definition.successResponseAsData()
        return list(definition)
    }

    def getSuccessResponseAsData() {
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeAllThenExcludeFromResponse(["password", "id", "lastUpdated", "dateCreated"])
        definition.successResponseAsData()
        return list(definition)
    }

    def postAddResponseProperty(){
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.addRequestProperty("name").enableTypeCast()
        definition.addRequestProperty("email")
        definition.addRequestProperty("password")
        definition.addRequestProperty("identification")
        definition.addResponseProperty("uuid")
        definition.successResponseAsData()
        return create(definition)
    }

    def getCustomResponseParamProcessor() {
        GsApiActionDefinition definition = new GsApiActionDefinition<Student>(Student)
        definition.includeInResponse(["nationalIdNumber", "name", "email"])
        definition.addResponseProperty("dateCreated").customResponseParamProcessor = new CustomResponseParamProcessor() {
            @Override
            Object process(String fieldName, Object domainRow, GsApiResponseProperty propertyDefinition) {
                return domainRow[fieldName]
            }
        }
        definition.successResponseAsData()
        return list(definition)
    }

}

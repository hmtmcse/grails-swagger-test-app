package com.hmtmcse.gst.system

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "swaggerUi", action: "index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}

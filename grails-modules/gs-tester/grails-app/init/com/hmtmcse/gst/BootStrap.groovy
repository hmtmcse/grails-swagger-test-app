package com.hmtmcse.gst

import com.hmtmcse.gauth.jwt.AuthenticationDataHolder

class BootStrap {

    def init = { servletContext ->
        AuthenticationDataHolder.isEnableJWTAuth = false
//        DataInitService.iniAll()
    }
    def destroy = {
    }
}

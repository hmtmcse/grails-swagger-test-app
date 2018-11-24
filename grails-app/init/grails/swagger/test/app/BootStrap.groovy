package grails.swagger.test.app

import com.hmtmcse.gstester.api.DataInitService

class BootStrap {

    def init = { servletContext ->
        DataInitService.iniAll()
    }
    def destroy = {
    }
}

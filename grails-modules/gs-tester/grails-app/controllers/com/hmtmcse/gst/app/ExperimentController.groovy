package com.hmtmcse.gst.app

import grails.converters.JSON

class ExperimentController {

    private Map mapTap(Map map, String seperator = "-"){
        map.each { tingTing ->
            if (tingTing.getValue() instanceof List){
                listTist(tingTing.getValue(), seperator += "-")
            }else if (tingTing.getValue() instanceof Map){
                mapTap(tingTing.getValue(), seperator += "-")
            }else{
                println("${seperator} Map: " + tingTing.getValue())
            }
        }
        return map
    }

    private List listTist(List list, String seperator = "-"){
        list.each { tingTing ->
            if (tingTing instanceof Map){
                mapTap(tingTing, seperator += "-")
            }else if (tingTing instanceof List){
                listTist(tingTing, seperator += "-")
            }else{
                println("${seperator} List: " + tingTing)
            }
        }
        return list
    }


    def index() {
        Map map = [:]
        map.put("name", "My Name is.")
        map.put("roll", 123456789)
        map.put("email", "my@email.local")
        map.put("listOnly", [1, 2, 3, 4])
        map.put("listOfMap", [
                ["name": "nodi", "type": "Mitha Pani"],
                ["name": "nala", "type": "Pocha Pani"]
        ])
        map.put("mapOnly", ["name": "Bristi", "type": "Bisuddho Pani"])
        mapTap(map)


        render(map as JSON)
    }


    def returnCheck(){
        Map map = [:]
        map.put("name", "My Name is.")
        map.put("roll", 123456789)
        map.put("email", "my@email.local")
        map.each {
            if (it.key == "name"){
                return
            }
            println(it.value)
        }

       def x = "10" as Long
        if (x instanceof Long){
            println("Long")
        }

        render("xyz")
    }
}

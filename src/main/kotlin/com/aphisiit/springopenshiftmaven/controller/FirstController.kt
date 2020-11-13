package com.aphisiit.springopenshiftmaven.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController {

    @GetMapping
    fun index() : String {
        return "<h1>Hello RedHat OpenShift</h1>"
    }
}
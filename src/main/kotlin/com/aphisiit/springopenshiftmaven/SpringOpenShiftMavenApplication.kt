package com.aphisiit.springopenshiftmaven

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringOpenShiftMavenApplication

fun main(args: Array<String>) {
    runApplication<SpringOpenShiftMavenApplication>(*args)
}

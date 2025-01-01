package com.alphaStore.namingServer

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/namingServer")
class HealthCheck {

    @GetMapping("/healthCheck")
    fun healthCheck(model: Model): String {
        model.addAttribute("message","I Am Up")
        return "<h1>I AM UP ..............<h1>"
    }

}
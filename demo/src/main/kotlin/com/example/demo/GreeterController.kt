package com.example.demo

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.*

data class HelloRequest(val name: String)
data class HelloResponse(val message: String)

@RestController
@RequestMapping("greeter")
class GreeterController(
    @Qualifier("EnglishMessageService")
    private val messageService: MessageService
) {
    @GetMapping("/hello")
    fun hello(@RequestParam("name") name: String): HelloResponse {
        return HelloResponse("Hello $name")
    }

    @GetMapping("/hello/{name}")
    fun helloPathValue(@PathVariable("name") name: String): HelloResponse {
        return HelloResponse("Hello $name")
    }

    @PostMapping("/hello")
    fun helloByPost(@RequestBody request: HelloRequest): HelloResponse {
        return HelloResponse("Hello ${request.name}")
    }
    @GetMapping("/hello/service")
    fun helloMessageService(): HelloResponse {
        return HelloResponse(messageService.displayLang())
    }
}

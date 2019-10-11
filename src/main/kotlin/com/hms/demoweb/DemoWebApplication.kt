package com.hms.demoweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class DemoWebApplication

fun main(args: Array<String>) {
	runApplication<DemoWebApplication>(*args)
}

@RestController
@RequestMapping("/demo")
class DemoController{

	@GetMapping
	fun demoGet() = "demo A"
}

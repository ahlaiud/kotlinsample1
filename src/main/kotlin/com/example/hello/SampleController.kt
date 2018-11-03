package com.example.hello

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/sample")
class SampleController{
	
	@RequestMapping("/hello")
	fun hello():String{
		println("hello")
		return "index"
	}
}
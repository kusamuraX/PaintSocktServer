package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
open class DispController {
	
	@GetMapping("/view")
	fun init() : String {
		return "Client"
	}
}
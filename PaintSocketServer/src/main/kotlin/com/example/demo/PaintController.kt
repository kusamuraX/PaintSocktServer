package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@Controller
class PaintController {
	
	@MessageMapping("/paint")
	@SendTo("/broadcast/writer")
	fun write(writeData : WriteData) : WriteData{
//		writeData.pointArray.forEach {
//			System.out.println("pointX:" + it.point_x + "pointY:" + it.point_y) 
//		}
		return writeData
	}
}
package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody

@Controller
class PaintController {
	
	companion object{
		var writeDataList: MutableList<WriteData> = mutableListOf()
	}
	
	
	@MessageMapping("/paint")
	@SendTo("/broadcast/writer")
	fun write(writeData : WriteData) : WriteData{
		System.out.println("color:" + writeData.style.color)
		System.out.println("width:" + writeData.style.width)
		writeDataList.add(writeData);
//		writeData.pointArray.forEach {
//			System.out.println("pointX:" + it.point_x + "pointY:" + it.point_y)
//		}
		return writeData
	}
}
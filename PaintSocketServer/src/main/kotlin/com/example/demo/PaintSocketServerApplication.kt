package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class PaintSocketServerApplication

fun main(args: Array<String>) {
	runApplication<PaintSocketServerApplication>(*args)
}

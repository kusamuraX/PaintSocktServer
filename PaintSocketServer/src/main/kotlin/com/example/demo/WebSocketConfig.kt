package com.example.demo

import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer
import org.springframework.web.socket.config.annotation.StompEndpointRegistry
import org.springframework.messaging.simp.config.MessageBrokerRegistry

@EnableWebSocketMessageBroker
@Configuration
open class WebSocketConfig : WebSocketMessageBrokerConfigurer {
	
	override fun registerStompEndpoints(registry : StompEndpointRegistry) {
		registry.addEndpoint("/paint").setAllowedOrigins("http://localhost:9080").withSockJS()
	}
	
	override fun configureMessageBroker(registry : MessageBrokerRegistry) {
		registry.setApplicationDestinationPrefixes("/app")
        registry.enableSimpleBroker("/broadcast", "/queue")
	}
}
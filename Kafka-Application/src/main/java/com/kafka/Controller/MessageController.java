package com.kafka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.Producer.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class MessageController {

	@Autowired
	private KafkaProducer kafkaproducer;
	
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message)
	{
		kafkaproducer.sendMessage(message);
		return ResponseEntity.ok("Message Sent to the Topic");
	}
	
}

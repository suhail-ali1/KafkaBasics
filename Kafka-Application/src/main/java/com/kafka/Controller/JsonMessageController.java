package com.kafka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.Model.User;
import com.kafka.Producer.JsonKafkaProducer;

@RestController
@RequestMapping("/json")
public class JsonMessageController {

	@Autowired
	private JsonKafkaProducer jsonprocuder;
	
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user )
	{
		jsonprocuder.sendMessage(user);
		return ResponseEntity.ok("Json Message sent to Kafka");
		
	}
	
	
}

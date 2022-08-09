/**
 * hungtv30 Jun 9, 2022
 *
 */
package com.example.demo.controller;

import com.example.demo.kafka.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.redis.MessageProducer;

/**
 * @author hungtv30
 *
 */
@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

	private KafkaProducer kafkaProducer;

	public MessageController(KafkaProducer kafkaProducer) {
		this.kafkaProducer = kafkaProducer;
	}
	
	@Autowired
	private MessageProducer messageProducer;

	@GetMapping("/publish")
	public ResponseEntity<String> publish() {
//		for (int i = 70; i < 75; i++) {
//			final int a = i;
//			CompletableFuture.runAsync(() -> kafkaProducer.sendMessage(Character.toString(a)));
//		}
		messageProducer.doProducer();
		return ResponseEntity.ok("Message sent to the topic");
	}
}

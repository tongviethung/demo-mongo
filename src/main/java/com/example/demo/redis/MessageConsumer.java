package com.example.demo.redis;

import java.util.List;

import org.springframework.kafka.listener.MessageListener;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

@Service
public class MessageConsumer implements MessageListener {
	private static final int TIMEOUT = 0;

	@Override
	public void onMessage(Object data) {
		Jedis jedis = new Jedis("localhost", 6379);

		while (true) {
			System.out.println("Waiting for a message in the queue 111111111111111111111111111");
			List<String> messages = jedis.blpop(TIMEOUT, "mq1-key");
			System.out.println("received message 111111111111111111111111111 with key:" + messages.get(0) + " with value:" + messages.get(1));
		}
	}
	
}

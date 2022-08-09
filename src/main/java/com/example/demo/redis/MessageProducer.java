package com.example.demo.redis;

import org.springframework.stereotype.Service;

import redis.clients.jedis.Jedis;

@Service
public class MessageProducer {

	public void doProducer() {
		Jedis jedis = new Jedis("localhost", 6379);

		jedis.rpush("mq1-key", "first message");
		jedis.rpush("mq1-key", "second message");
		jedis.rpush("mq1-key", "third message");
		System.out.println(jedis.llen("mq1-key"));
		System.out.println("DONE!!!!");
	}

}

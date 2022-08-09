/**
 * hungtv30 Jun 17, 2022
 *
 */
package com.example.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author hungtv30
 *
 */
@Service
public class KafkaConsumer2 {

  private static final Logger log = LoggerFactory.getLogger(KafkaConsumer.class);
  
//  @KafkaListener(topics = "javaguides", groupId = "myGroup")
  private void consume(String message) {
    log.info("demo2 - KafkaConsumer- Message received -> {}", message);
    try {
      Thread.sleep(1000l);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("demo2 - KafkaConsumer-5");
    try {
      Thread.sleep(1000l);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("demo2 - KafkaConsumer-4");
    try {
      Thread.sleep(1000l);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("demo2 - KafkaConsumer-3");
    try {
      Thread.sleep(1000l);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("demo2 - KafkaConsumer-2");
    try {
      Thread.sleep(1000l);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("demo2 - KafkaConsumer-1");
    log.info("demo2 - KafkaConsumer- Message received -> {}", message);
  }
}

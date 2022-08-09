/**
 * hungtv30 Jun 9, 2022
 *
 */
package com.example.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author hungtv30
 *
 */
@Service
public class KafkaProducer {

  private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);
  
  private KafkaTemplate<String, String> kafkaTemplate;
  
  public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }
  
  public void sendMessage(String message) {
    log.info(message);
    kafkaTemplate.send("javaguides", message);
  }
}

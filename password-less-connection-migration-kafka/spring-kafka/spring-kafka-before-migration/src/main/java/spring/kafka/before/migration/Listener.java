package spring.kafka.before.migration;

import org.springframework.kafka.annotation.KafkaListener;

public class Listener {
    @KafkaListener(id = "listen1", topics = "kafka-spring-before-migration-topic")
    public void listen1(String string) {
        System.out.println("Received message: string = " + string);
    }
}

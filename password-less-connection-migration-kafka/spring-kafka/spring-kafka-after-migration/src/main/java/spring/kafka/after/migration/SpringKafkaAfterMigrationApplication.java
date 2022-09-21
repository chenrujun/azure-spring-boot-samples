package spring.kafka.after.migration;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.Date;

@SpringBootApplication
public class SpringKafkaAfterMigrationApplication {

    private static final String TOPIC_NAME = "kafka-spring-after-migration-topic";

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaAfterMigrationApplication.class, args);
    }

    @KafkaListener(id = "myId", topics = TOPIC_NAME)
    public void listen(String in) {
        System.out.println("Received message: " + in);
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args -> {
            String message = "test data. date = " + new Date();
            System.out.println("Sending message: " + message);
            template.send(TOPIC_NAME, message);
        };
    }
}

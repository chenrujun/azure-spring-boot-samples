package spring.kafka.after.migration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaAfterMigrationApplication {

    private static final String TOPIC_NAME = "SpringKafkaBeforeMigrationApplicationTopic";

    public static void main(String[] args) {
        SpringApplication.run(SpringKafkaAfterMigrationApplication.class, args);
    }

    @Bean
    public NewTopic topic() {
        return TopicBuilder.name(TOPIC_NAME)
                .partitions(10)
                .replicas(1)
                .build();
    }

    @KafkaListener(id = "myId", topics = TOPIC_NAME)
    public void listen(String in) {
        System.out.println("Received message: " + in);
    }

    @Bean
    public ApplicationRunner runner(KafkaTemplate<String, String> template) {
        return args -> {
            String message = "test data 111";
            System.out.println("Sending message: " + message);
            template.send(TOPIC_NAME, message);
        };
    }
}

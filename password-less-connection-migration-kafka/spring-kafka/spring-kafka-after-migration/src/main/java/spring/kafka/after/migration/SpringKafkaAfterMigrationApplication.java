package spring.kafka.after.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringKafkaAfterMigrationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringKafkaAfterMigrationApplication.class);
        context.getBean(Sender.class).send("kafka-spring-before-migration-send-key", "kafka-spring-before-migration-send-data");
    }
}

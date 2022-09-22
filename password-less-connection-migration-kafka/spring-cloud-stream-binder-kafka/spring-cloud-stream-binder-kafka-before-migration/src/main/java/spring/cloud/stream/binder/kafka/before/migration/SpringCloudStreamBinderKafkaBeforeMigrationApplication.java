package spring.cloud.stream.binder.kafka.before.migration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
public class SpringCloudStreamBinderKafkaBeforeMigrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamBinderKafkaBeforeMigrationApplication.class);
    }

    @Bean
    public Supplier<String> producer() {
        return () -> {
            String data = "Test data by producer. date = " + new Date();
            System.out.println("Producing string. data = " + data);
            return data;
        };
    }

    @Bean
    public Consumer<String> consumer() {
        return message -> System.out.println("Consuming message. message = " + message);
    }
}

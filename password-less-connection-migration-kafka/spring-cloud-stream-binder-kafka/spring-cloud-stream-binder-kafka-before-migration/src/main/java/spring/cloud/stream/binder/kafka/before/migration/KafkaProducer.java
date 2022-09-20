package spring.cloud.stream.binder.kafka.before.migration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KafkaProducer {

    @Autowired
    private StreamBridge streamBridge;

    @Scheduled(cron = "*/2 * * * * *")
    public void sendMessage(){
        String message = "test message.";
        System.out.println("Sending message by streamBridge. message = " + message);
        streamBridge.send("producer-out-0", message);
    }
}

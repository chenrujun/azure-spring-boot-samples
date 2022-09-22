package spring.cloud.stream.binder.kafka.before.migration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class KafkaProducer {

    @Autowired
    private StreamBridge streamBridge;

    @Scheduled(cron = "*/2 * * * * *")
    public void sendMessage(){
        String data = "test message. date = " + new Date();
        System.out.println("Sending message by streamBridge. data = " + data);
        streamBridge.send("producer-out-0", data);
    }
}

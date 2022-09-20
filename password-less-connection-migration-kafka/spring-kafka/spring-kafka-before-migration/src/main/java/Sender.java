import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

public class Sender {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.getBean(Sender.class).send("kafka-spring-before-migration-send-key", "kafka-spring-before-migration-send-data");
    }

    private final KafkaTemplate<String, String> template;

    public Sender(KafkaTemplate<String, String> template) {
        this.template = template;
    }

    public void send(String key, String data) {
        System.out.println("Sending message: key = " + key + ", data = " + data);
        this.template.send("kafka-spring-before-migration-topic", key, data);
    }
}

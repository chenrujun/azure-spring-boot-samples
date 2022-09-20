import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.config.SaslConfigs;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.concurrent.Future;

public class BeforeMigrationApplication {

    public static void main(String[] args) {
        try (Producer<String, String> producer = createProducer()) {
            ProducerRecord<String, String> record = new ProducerRecord<>("before-migration-topic", "before-migration-key", "before-migration-value");
            Future<RecordMetadata> future = producer.send(record);
            RecordMetadata metadata = future.get();
            System.out.println(metadata.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error happened when produce message. " + e);
        }
    }

    private static Producer<String, String> createProducer() {
        String hostName = System.getProperty("hostName");
        String connectionString = System.getProperty("connectionString");

        Properties properties = new Properties();
        properties.put(CommonClientConfigs.BOOTSTRAP_SERVERS_CONFIG, String.format("%s:9093", hostName));
        properties.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_SSL");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(SaslConfigs.SASL_MECHANISM, "PLAIN");
        properties.put(SaslConfigs.SASL_JAAS_CONFIG,
                String.format("org.apache.kafka.common.security.plain.PlainLoginModule required username=\"$ConnectionString\" password=\"%s\";", connectionString));

        return new KafkaProducer<>(properties);
    }
}

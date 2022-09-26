FROM azul/zulu-openjdk-alpine:8
VOLUME /tmp
EXPOSE 8080
COPY target/spring-cloud-stream-binder-kafka-after-migration-1.0.0-SNAPSHOT.jar app.jar
ENTRYPOINT java -jar /app.jar
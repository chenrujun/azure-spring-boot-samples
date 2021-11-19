
## Current Branch Supported versions
- [spring-boot-dependencies:2.5.2](https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/2.5.2/spring-boot-dependencies-2.5.2.pom).
- [spring-cloud-dependencies:2020.0.3](https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-dependencies/2020.0.3/spring-cloud-dependencies-2020.0.3.pom).

## All active branches

| spring boot version | spring cloud version | azure spring boot version | 
| ---                 | ---                  | ---                       | 
| 2.5.2               | 2020.0.3             | [4.0](https://github.com/Azure/azure-sdk-for-java/tree/feature/azure-spring-cloud-4.0/sdk/spring)                     | 

## All samples in this repo

| Azure Service    | Azure Spring Starter Dependency                                                                | Sample Project                                                                                                                    |
|------------------|------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------------------------|
| AAD              | [azure-spring-boot-starter-active-directory-b2c:3.9.0]                                         | [aad-b2c-resource-server](aad/azure-spring-boot-starter-active-directory-b2c/aad-b2c-resource-server)                             |
| AAD              | [azure-spring-boot-starter-active-directory-b2c:3.9.0]                                         | [aad-b2c-web-application](aad/azure-spring-boot-starter-active-directory-b2c/aad-b2c-web-application)                             |
| AAD              | [azure-spring-boot-starter-active-directory:3.9.0]                                             | [aad-resource-server-by-filter-stateless](aad/azure-spring-boot-starter-active-directory/aad-resource-server-by-filter-stateless) |
| AAD              | [azure-spring-boot-starter-active-directory:3.9.0]                                             | [aad-resource-server-by-filter](aad/azure-spring-boot-starter-active-directory/aad-resource-server-by-filter)                     |
| AAD              | [azure-spring-boot-starter-active-directory:3.9.0]                                             | [aad-resource-server-obo](aad/azure-spring-boot-starter-active-directory/aad-resource-server-obo)                                 |
| AAD              | [azure-spring-boot-starter-active-directory:3.9.0]                                             | [aad-resource-server](aad/azure-spring-boot-starter-active-directory/aad-resource-server)                                         |
| AAD              | [azure-spring-boot-starter-active-directory:3.9.0]                                             | [aad-web-application](aad/azure-spring-boot-starter-active-directory/aad-web-application)                                         |
| AAD              | [azure-spring-boot-starter-active-directory:3.9.0]                                             | [aad-webapp-resource-server](aad/azure-spring-boot-starter-active-directory/aad-web-application-and-resource-server)              |
| appconfiguration | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [azure-appconfiguration-conversion-sample-initial](appconfiguration/azure-appconfiguration-conversion-sample-initial)             |
| appconfiguration | [spring-cloud-azure-appconfiguration-config:1.3.0]                                             | [azure-appconfiguration-sample](appconfiguration/azure-appconfiguration-sample)                                                   |
| appconfiguration | [spring-cloud-azure-feature-management:1.3.0]                                                  | [feature-management-sample](appconfiguration/feature-management-sample)                                                           |
| appconfiguration | [spring-cloud-azure-feature-management:1.3.0]                                                  | [feature-management-web-sample](appconfiguration/feature-management-web-sample)                                                   |
| appconfiguration | [spring-cloud-starter-azure-appconfiguration-config:1.3.0]                                     | [azure-appconfiguration-conversion-sample-complete](appconfiguration/azure-appconfiguration-conversion-sample-complete)           |
| cache            | [azure-spring-cloud-starter-cache:2.9.0]                                                       | [azure-spring-cloud-sample-cache](cache/azure-spring-cloud-sample-cache)                                                          |
| cloudfoundry     | [azure-spring-boot-starter-cosmos:3.9.0]<br />[azure-spring-boot-starter-servicebus-jms:3.9.0] | [azure-cloud-foundry-service-sample](cloudfoundry/azure-cloud-foundry-service-sample)                                             |
| cosmos           | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [cosmos-multi-database-multi-account](cosmos/azure-spring-boot-starter-cosmos/cosmos-multi-database-multi-account)                |
| cosmos           | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [cosmos-multi-database-single-account](cosmos/azure-spring-boot-starter-cosmos/cosmos-multi-database-single-account)              |
| cosmos           | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [cosmos](cosmos/azure-spring-boot-starter-cosmos/cosmos)                                                                          |
| eventhubs        | [azure-spring-cloud-starter-eventhubs-kafka:2.9.0]                                             | [eventhubs-kafka](eventhubs/azure-spring-cloud-starter-eventhubs-kafka/eventhubs-kafka)                                           |
| eventhubs        | [azure-spring-cloud-starter-eventhubs:2.9.0]                                                   | [eventhubs-integration](eventhubs/azure-spring-cloud-starter-eventhubs/eventhubs-integration)                                     |
| eventhubs        | [azure-spring-cloud-starter-eventhubs:2.9.0]                                                   | [eventhubs-messaging](eventhubs/azure-spring-cloud-starter-eventhubs/eventhubs-messaging)                                         |
| eventhubs        | [azure-spring-cloud-starter-eventhubs:2.9.0]                                                   | [eventhubs-operation](eventhubs/azure-spring-cloud-starter-eventhubs/eventhubs-operation)                                         |
| eventhubs        | [azure-spring-cloud-stream-binder-eventhubs:2.9.0]                                             | [eventhubs-binder](eventhubs/azure-spring-cloud-stream-binder-eventhubs/eventhubs-binder)                                         |
| eventhubs        | [azure-spring-cloud-stream-binder-eventhubs:2.9.0]                                             | [eventhubs-multibinders](eventhubs/azure-spring-cloud-stream-binder-eventhubs/eventhubs-multibinders)                             |
| keyvault         | [azure-spring-boot-starter-keyvault-certificates:3.2.0]                                        | [keyvault-certificates-client-side](keyvault/azure-spring-boot-starter-keyvault-certificates/keyvault-certificates-client-side)   |
| keyvault         | [azure-spring-boot-starter-keyvault-certificates:3.2.0]                                        | [keyvault-certificates-server-side](keyvault/azure-security-keyvault-jca/run-with-command-line-server-side)   |
| keyvault         | [azure-security-keyvault-jca:2.1.0]                                                            | [run-with-command-line-server-side](keyvault/azure-security-keyvault-jca/run-with-command-line-client-side)   |
| keyvault         | [azure-security-keyvault-jca:2.1.0]                                                            | [run-with-command-line-client-side](keyvault/azure-spring-boot-starter-keyvault-certificates/keyvault-certificates-server-side)   |
| keyvault         | [spring-cloud-azure-starter-keyvault-secrets:4.0.0-beta.1]                                     | [keyvault-secrets](keyvault/spring-cloud-azure-starter-keyvault-secrets/keyvault-secrets)                                          |
| mediaservices    | [azure-media:0.9.8]                                                                            | [azure-spring-boot-sample-mediaservices](mediaservices/azure-spring-boot-sample-mediaservices)                                    |
| servicebus       | [azure-messaging-servicebus:7.4.0]                                                             | [servicebus](servicebus/azure-messaging-servicebus/servicebus)                                                                    |
| servicebus       | [azure-spring-boot-starter-servicebus-jms:3.9.0]                                               | [servicebus-jms-queue](servicebus/azure-spring-boot-starter-servicebus-jms/servicebus-jms-queue)                                  |
| servicebus       | [azure-spring-boot-starter-servicebus-jms:3.9.0]                                               | [servicebus-jms-topic](servicebus/azure-spring-boot-starter-servicebus-jms/servicebus-jms-topic)                                  |
| servicebus       | [azure-spring-cloud-starter-servicebus:2.9.0]                                                  | [servicebus-integration](servicebus/azure-spring-cloud-starter-servicebus/servicebus-integration)                                 |
| servicebus       | [azure-spring-cloud-starter-servicebus:2.9.0]                                                  | [servicebus-messaging](servicebus/azure-spring-cloud-starter-servicebus/servicebus-messaging)                                     |
| servicebus       | [azure-spring-cloud-starter-servicebus:2.9.0]                                                  | [servicebus-operation](servicebus/azure-spring-cloud-starter-servicebus/servicebus-operation)                                     |
| servicebus       | [azure-spring-cloud-stream-binder-servicebus-queue:2.9.0]                                      | [servicebus-queue-binder](servicebus/azure-spring-cloud-stream-binder-servicebus-queue/servicebus-queue-binder)                   |
| servicebus       | [azure-spring-cloud-stream-binder-servicebus-queue:2.9.0]                                      | [servicebus-queue-multibinders](servicebus/azure-spring-cloud-stream-binder-servicebus-queue/servicebus-queue-multibinders)       |
| servicebus       | [azure-spring-cloud-stream-binder-servicebus-topic:2.9.0]                                      | [servicebus-topic-binder](servicebus/azure-spring-cloud-stream-binder-servicebus-topic/servicebus-topic-binder)                   |
| storage          | [azure-spring-boot-starter-storage:3.9.0]                                                      | [storage-resource](storage/azure-spring-boot-starter-storage/storage-resource)                                                    |
| storage          | [azure-spring-cloud-starter-storage-queue:2.9.0]                                               | [storage-queue-integration](storage/azure-spring-cloud-starter-storage-queue/storage-queue-integration)                           |
| storage          | [azure-spring-cloud-starter-storage-queue:2.9.0]                                               | [storage-queue-operation](storage/azure-spring-cloud-starter-storage-queue/storage-queue-operation)                               |

### 

[main]: https://github.com/Azure-Samples/azure-spring-boot-samples
[azure-spring-boot-starter-servicebus-jms:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-servicebus-jms/3.9.0/jar
[azure-spring-boot-starter-cosmos:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-cosmos/3.9.0/jar
[azure-spring-cloud-starter-cache:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-starter-cache/2.9.0/jar
[spring-cloud-azure-feature-management:1.3.0]: https://search.maven.org/artifact/com.microsoft.azure/spring-cloud-azure-feature-management/1.3.0/jar
[spring-cloud-azure-appconfiguration-config:1.3.0]: https://search.maven.org/artifact/com.microsoft.azure/spring-cloud-azure-appconfiguration-config/1.3.0/jar
[azure-spring-boot-starter-cosmos:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-cosmos/3.9.0/jar
[spring-cloud-starter-azure-appconfiguration-config:1.3.0]: https://search.maven.org/artifact/com.microsoft.azure/spring-cloud-starter-azure-appconfiguration-config/1.3.0/jar
[azure-messaging-servicebus:7.4.0]: https://search.maven.org/artifact/com.azure/azure-messaging-servicebus/7.4.0/jar
[azure-media:0.9.8]: https://search.maven.org/artifact/com.microsoft.azure/azure-media/0.9.8/jar
[spring-cloud-azure-starter-keyvault-secrets:4.0.0-beta.1]: https://search.maven.org/artifact/com.azure.spring/spring-cloud-azure-starter-keyvault-secrets/4.0.0-beta.1/jar
[azure-spring-boot-starter-keyvault-certificates:3.2.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-keyvault-certificates/3.2.0/jar
[azure-spring-cloud-stream-binder-eventhubs:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-stream-binder-eventhubs/2.9.0/jar
[azure-spring-cloud-starter-eventhubs-kafka:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-starter-eventhubs-kafka/2.9.0/jar
[azure-spring-cloud-starter-eventhubs:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-starter-eventhubs/2.9.0/jar
[azure-spring-boot-starter-cosmos:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-cosmos/3.9.0/jar
[azure-spring-cloud-stream-binder-servicebus-topic:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-stream-binder-servicebus-topic/2.9.0/jar
[azure-spring-cloud-stream-binder-servicebus-queue:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-stream-binder-servicebus-queue/2.9.0/jar
[azure-spring-boot-starter-storage:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-storage/3.9.0/jar
[azure-spring-boot-starter-active-directory:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-active-directory/3.9.0/jar
[azure-spring-boot-starter-active-directory-b2c:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-active-directory-b2c/3.9.0/jar
[azure-spring-boot-starter-servicebus-jms:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-servicebus-jms/3.9.0/jar
[azure-spring-cloud-starter-servicebus:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-starter-servicebus/2.9.0/jar
[azure-spring-cloud-starter-storage-queue:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-starter-storage-queue/2.9.0/jar
[azure-security-keyvault-jca:2.1.0]: https://mvnrepository.com/artifact/com.azure/azure-security-keyvault-jca
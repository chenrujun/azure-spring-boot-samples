
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
| AAD              | [spring-cloud-azure-starter-active-directory-b2c:4.0.0.beta-1]                                 | [aad-b2c-resource-server](aad/spring-cloud-azure-starter-active-directory-b2c/aad-b2c-resource-server)                             |
| AAD              | [spring-cloud-azure-starter-active-directory-b2c:4.0.0.beta-1]                                 | [aad-b2c-web-application](aad/spring-cloud-azure-starter-active-directory-b2c/aad-b2c-web-application)                             |
| AAD              | [spring-cloud-azure-starter-active-directory:4.0.0.beta-1]                                     | [aad-resource-server-by-filter-stateless](aad/spring-cloud-azure-starter-active-directory/aad-resource-server-by-filter-stateless) |
| AAD              | [spring-cloud-azure-starter-active-directory:4.0.0.beta-1]                                     | [aad-resource-server-by-filter](aad/spring-cloud-azure-starter-active-directory/aad-resource-server-by-filter)                     |
| AAD              | [spring-cloud-azure-starter-active-directory:4.0.0.beta-1]                                     | [aad-resource-server-obo](aad/spring-cloud-azure-starter-active-directory/aad-resource-server-obo)                                 |
| AAD              | [spring-cloud-azure-starter-active-directory:4.0.0.beta-1]                                     | [aad-resource-server](aad/spring-cloud-azure-starter-active-directory/aad-resource-server)                                         |
| AAD              | [spring-cloud-azure-starter-active-directory:4.0.0.beta-1]                                     | [aad-web-application](aad/spring-cloud-azure-starter-active-directory/aad-web-application)                                         |
| AAD              | [spring-cloud-azure-starter-active-directory:4.0.0.beta-1]                                     | [aad-webapp-resource-server](aad/spring-cloud-azure-starter-active-directory/aad-web-application-and-resource-server)              |
| appconfiguration | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [azure-appconfiguration-conversion-sample-initial](appconfiguration/azure-appconfiguration-conversion-sample-initial)             |
| appconfiguration | [spring-cloud-azure-appconfiguration-config:1.3.0]                                             | [azure-appconfiguration-sample](appconfiguration/azure-appconfiguration-sample)                                                   |
| appconfiguration | [spring-cloud-azure-feature-management:1.3.0]                                                  | [feature-management-sample](appconfiguration/feature-management-sample)                                                           |
| appconfiguration | [spring-cloud-azure-feature-management:1.3.0]                                                  | [feature-management-web-sample](appconfiguration/feature-management-web-sample)                                                   |
| appconfiguration | [spring-cloud-starter-azure-appconfiguration-config:1.3.0]                                     | [azure-appconfiguration-conversion-sample-complete](appconfiguration/azure-appconfiguration-conversion-sample-complete)           |
| cache            | N/A                                                                                            | [azure-spring-cloud-sample-cache](cache/spring-cloud-azure-starter/spring-cloud-azure-sample-cache)                                                          |
| cloudfoundry     | [azure-spring-boot-starter-cosmos:3.9.0]<br />[azure-spring-boot-starter-servicebus-jms:3.9.0] | [azure-cloud-foundry-service-sample](cloudfoundry/azure-cloud-foundry-service-sample)                                             |
| cosmos           | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [cosmos-multi-database-multi-account](cosmos/azure-spring-data-cosmos/cosmos-multi-database-multi-account)                |
| cosmos           | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [cosmos-multi-database-single-account](cosmos/azure-spring-data-cosmos/cosmos-multi-database-single-account)              |
| cosmos           | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [spring-cloud-azure-data-cosmos-sample](cosmos/spring-cloud-azure-starter-data-cosmos/spring-cloud-azure-data-cosmos-sample)                                                                          |
| cosmos           | [azure-spring-boot-starter-cosmos:3.9.0]                                                       | [spring-cloud-azure-cosmos-sample](cosmos/spring-cloud-azure-starter-cosmos/spring-cloud-azure-cosmos-sample)                                                                          |
| eventhubs        | N/A                                                                                            | [spring-cloud-azure-sample-eventhubs-kafka](eventhubs/spring-cloud-azure-starter/spring-cloud-azure-sample-eventhubs-kafka)                                           |
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
| servicebus       | [spring-cloud-azure-starter-servicebus-jms:4.0.0-beta.1]                                       | [servicebus-jms-queue](servicebus/spring-cloud-azure-starter-servicebus-jms/servicebus-jms-queue)                                  |
| servicebus       | [spring-cloud-azure-starter-servicebus-jms:4.0.0-beta.1]                                       | [servicebus-jms-topic](servicebus/spring-cloud-azure-starter-servicebus-jms/servicebus-jms-topic)                                  |
| servicebus       | [spring-cloud-azure-starter-integration-servicebus:4.0.0-beta.1]                               | [single-namespaces](servicebus/spring-cloud-azure-starter-integration-servicebus/single-namespaces)                                 |
| servicebus       | [spring-cloud-azure-starter-integration-servicebus:4.0.0-beta.1]                               | [multiple-namespaces](servicebus/spring-cloud-azure-starter-integration-servicebus/multiple-namespaces)                                 |
| servicebus       | [spring-cloud-azure-stream-binder-servicebus:4.0.0-beta.1]                                     | [servicebus-queue-binder](servicebus/spring-cloud-azure-stream-binder-servicebus/servicebus-queue-binder)                   |
| servicebus       | [spring-cloud-azure-stream-binder-servicebus:4.0.0-beta.1]                                     | [servicebus-queue-multibinders](servicebus/spring-cloud-azure-stream-binder-servicebus/servicebus-queue-multibinders)       |
| servicebus       | [spring-cloud-azure-stream-binder-servicebus:4.0.0-beta.1]                                     | [servicebus-topic-binder](servicebus/spring-cloud-azure-stream-binder-servicebus/servicebus-topic-binder)                   |
| storage          | [spring-cloud-azure-starter-storage-blob:4.0.0-beta.1]                                         | [storage-blob-sample](storage/spring-cloud-azure-starter-storage-blob/storage-blob-sample)     
| storage          | [spring-cloud-azure-starter-storage-file-share:4.0.0-beta.1]                                   | [storage-file-sample](storage/spring-cloud-azure-starter-storage-file-share/storage-file-sample)     |
| storage          | [spring-cloud-azure-starter-integration-storage-queue:4.0.0-beta.1]                            | [storage-queue-integration](storage/spring-cloud-azure-starter-integration-storage-queue/storage-queue-integration)                           |
| storage          | [spring-cloud-azure-starter-integration-storage-queue:4.0.0-beta.1]                            | [storage-queue-operation](storage/spring-cloud-azure-starter-integration-storage-queue/storage-queue-operation)                               |

### 

[main]: https://github.com/Azure-Samples/azure-spring-boot-samples
[azure-spring-boot-starter-servicebus-jms:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-servicebus-jms/3.9.0/jar
[azure-spring-boot-starter-cosmos:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-cosmos/3.9.0/jar
[spring-cloud-azure-feature-management:1.3.0]: https://search.maven.org/artifact/com.microsoft.azure/spring-cloud-azure-feature-management/1.3.0/jar
[spring-cloud-azure-appconfiguration-config:1.3.0]: https://search.maven.org/artifact/com.microsoft.azure/spring-cloud-azure-appconfiguration-config/1.3.0/jar
[azure-spring-boot-starter-cosmos:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-cosmos/3.9.0/jar
[spring-cloud-starter-azure-appconfiguration-config:1.3.0]: https://search.maven.org/artifact/com.microsoft.azure/spring-cloud-starter-azure-appconfiguration-config/1.3.0/jar
[azure-messaging-servicebus:7.4.0]: https://search.maven.org/artifact/com.azure/azure-messaging-servicebus/7.4.0/jar
[azure-media:0.9.8]: https://search.maven.org/artifact/com.microsoft.azure/azure-media/0.9.8/jar
[spring-cloud-azure-starter-keyvault-secrets:4.0.0-beta.1]: https://search.maven.org/artifact/com.azure.spring/spring-cloud-azure-starter-keyvault-secrets/4.0.0-beta.1/jar
[azure-spring-boot-starter-keyvault-certificates:3.2.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-keyvault-certificates/3.2.0/jar
[azure-spring-cloud-stream-binder-eventhubs:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-stream-binder-eventhubs/2.9.0/jar
[azure-spring-cloud-starter-eventhubs:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-starter-eventhubs/2.9.0/jar
[azure-spring-boot-starter-cosmos:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-cosmos/3.9.0/jar
[spring-cloud-azure-stream-binder-servicebus:4.0.0-beta.1]: https://search.maven.org/artifact/com.azure.spring/spring-cloud-azure-stream-binder-servicebus/4.0.0-beta.1/jar
[azure-spring-boot-starter-storage:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-storage/3.9.0/jar
[spring-cloud-azure-starter-active-directory:4.0.0.beta-1]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-active-directory/3.9.0/jar
[spring-cloud-azure-starter-active-directory-b2c:4.0.0.beta-1]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-active-directory-b2c/3.9.0/jar
[azure-spring-boot-starter-servicebus-jms:3.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-boot-starter-servicebus-jms/3.9.0/jar
[spring-cloud-azure-starter-integration-servicebus:4.0.0-beta.1]: https://search.maven.org/artifact/com.azure.spring/spring-cloud-azure-starter-integration-servicebus/4.0.0-beta.1/jar
[azure-spring-cloud-starter-storage-queue:2.9.0]: https://search.maven.org/artifact/com.azure.spring/azure-spring-cloud-starter-storage-queue/2.9.0/jar
[azure-security-keyvault-jca:2.1.0]: https://mvnrepository.com/artifact/com.azure/azure-security-keyvault-jca
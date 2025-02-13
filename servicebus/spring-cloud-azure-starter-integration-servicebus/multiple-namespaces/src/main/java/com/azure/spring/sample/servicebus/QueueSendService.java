// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.sample.servicebus;

import com.azure.spring.integration.core.handler.DefaultMessageHandler;
import com.azure.spring.cloud.service.servicebus.properties.ServiceBusEntityType;
import com.azure.spring.messaging.servicebus.core.ServiceBusTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFutureCallback;


@Service
public class QueueSendService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueueSendService.class);
    private static final String OUTPUT_CHANNEL_QUEUE1 = "queue1.output";
    private static final String QUEUE_NAME = "queue1";

    @Bean
    @ServiceActivator(inputChannel = OUTPUT_CHANNEL_QUEUE1)
    public MessageHandler queueMessageSender(ServiceBusTemplate serviceBusTemplate) {
        serviceBusTemplate.setDefaultEntityType(ServiceBusEntityType.QUEUE);
        DefaultMessageHandler handler = new DefaultMessageHandler(QUEUE_NAME, serviceBusTemplate);
        handler.setSendCallback(new ListenableFutureCallback<Void>() {
            @Override
            public void onSuccess(Void result) {
                LOGGER.info("Message was sent successfully for {}.", QUEUE_NAME);
            }

            @Override
            public void onFailure(Throwable ex) {
                LOGGER.info("There was an error sending the message.");
            }
        });

        return handler;
    }

    /**
     * Message gateway binding with {@link MessageHandler}
     * via {@link MessageChannel} has name {@value OUTPUT_CHANNEL_QUEUE1}
     */
    @MessagingGateway(defaultRequestChannel = OUTPUT_CHANNEL_QUEUE1)
    public interface QueueSendGateway {
        void send(String text);
    }
}

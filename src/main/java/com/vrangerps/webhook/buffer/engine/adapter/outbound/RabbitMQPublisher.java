package com.vrangerps.webhook.buffer.engine.adapter.outbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;
import com.vrangerps.webhook.buffer.engine.ports.outbound.LeadEventPublisher;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQPublisher implements LeadEventPublisher {

    @Value("${rabbitmq.exchange.name}")
    private String exchangeName;

    @Value("${rabbitmq.routing.key}")
    private String routingKey;

    private RabbitTemplate rabbitTemplate;

    @Autowired
    public RabbitMQPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void publishLeadEvent(LeadData leadData) {
        rabbitTemplate.convertAndSend(exchangeName, routingKey, leadData.toString());
    }
}

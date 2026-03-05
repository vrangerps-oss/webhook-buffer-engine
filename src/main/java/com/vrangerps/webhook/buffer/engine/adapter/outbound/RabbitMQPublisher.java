package com.vrangerps.webhook.buffer.engine.adapter.outbound;

import com.vrangerps.webhook.buffer.engine.config.RabbitMQConfig;
import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;
import com.vrangerps.webhook.buffer.engine.ports.outbound.LeadEventPublisher;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQPublisher implements LeadEventPublisher {

    private RabbitTemplate rabbitTemplate;

    public RabbitMQPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void publishLeadEvent(LeadData leadData) {
        rabbitTemplate.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, RabbitMQConfig.ROUTING_KEY, leadData.toString());
    }
}

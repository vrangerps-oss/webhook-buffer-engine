package com.vrangerps.webhook.buffer.engine.adapter.inbound;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import com.vrangerps.webhook.buffer.engine.config.RabbitMQConfig;
import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;

@Component
public class RabbitMQListener {

    LeadDataService leadDataService;

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void listenLeadEvent(LeadData leadData) {
        leadDataService.processLeadEvent(leadData);
    }

}

package com.vrangerps.webhook.buffer.engine.ports.outbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;

public interface LeadEventPublisher {
    void publishLeadEvent(LeadData leadData);
}

package com.vrangerps.webhook.buffer.engine.ports.inbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;

public interface LeadWebhookProcessor {
    void processLeadEvent(LeadData leadData);
}

package com.vrangerps.webhook.buffer.engine.ports.inbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;

import java.util.List;

public interface LeadWebhookReceiver {
    void receiveLeadEvent(List<LeadData> leadDataList);
}

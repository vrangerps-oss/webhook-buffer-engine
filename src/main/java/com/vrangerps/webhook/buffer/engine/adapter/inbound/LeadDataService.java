package com.vrangerps.webhook.buffer.engine.adapter.inbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;
import com.vrangerps.webhook.buffer.engine.ports.inbound.LeadWebhookProcessor;
import com.vrangerps.webhook.buffer.engine.ports.inbound.LeadWebhookReceiver;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LeadDataService implements LeadWebhookReceiver, LeadWebhookProcessor {
    
    @Override
    public void receiveLeadEvent(List<LeadData> leadDataList) {

    }

    @Override
    public void processLeadEvent(LeadData leadData) {
        
    }
}

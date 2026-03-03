package com.vrangerps.webhook.buffer.engine.adapter.inbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;
import com.vrangerps.webhook.buffer.engine.ports.inbound.LeadWebhookProcessor;
import com.vrangerps.webhook.buffer.engine.ports.inbound.LeadWebhookReceiver;
import com.vrangerps.webhook.buffer.engine.ports.outbound.LeadEventPublisher;
import com.vrangerps.webhook.buffer.engine.ports.outbound.LeadRepository;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class LeadDataService implements LeadWebhookReceiver, LeadWebhookProcessor {

    private final LeadEventPublisher leadEventPublisher;
    private final LeadRepository leadRepository;

    public LeadDataService(LeadEventPublisher leadEventPublisher, LeadRepository leadRepository) {
        this.leadEventPublisher = leadEventPublisher;
        this.leadRepository = leadRepository;
    }
    
    @Override
    public void receiveLeadEvent(List<LeadData> leadDataList) {
        for (LeadData leadData : leadDataList) {
            leadEventPublisher.publishLeadEvent(leadData);   
        }
    }

    @Override
    public void processLeadEvent(LeadData leadData) {
        leadRepository.findMatchingLeads(leadData);
        leadRepository.saveLead(leadData);
    }
}

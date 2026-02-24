package com.vrangerps.webhook.buffer.engine.ports.outbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;

public interface LeadRepository {
    void findMatchingLeads(LeadData leadData);
    void saveLead(LeadData leadData);
}

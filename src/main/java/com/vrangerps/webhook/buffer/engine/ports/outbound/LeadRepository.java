package com.vrangerps.webhook.buffer.engine.ports.outbound;

public interface LeadRepository {
    void findMatchingLeads();
    void saveLead();
}

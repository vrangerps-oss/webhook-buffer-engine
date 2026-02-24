package com.vrangerps.webhook.buffer.engine.domain.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeadDataTest {

    @Test
    void leadDataTest(){
        LeadData leadData = new LeadData("000000000000123", "first", "last", "firstlast@gmail.com", "Company LMT");
        Assertions.assertEquals("000000000000123", leadData.getLeadId());
        Assertions.assertEquals("first", leadData.getFirstName());
        Assertions.assertEquals("last", leadData.getLastName());
        Assertions.assertEquals("firstlast@gmail.com", leadData.getEmail());
        Assertions.assertEquals("Company LMT", leadData.getCompany());
    }
}
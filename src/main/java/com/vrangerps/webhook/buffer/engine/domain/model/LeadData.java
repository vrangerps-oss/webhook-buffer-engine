package com.vrangerps.webhook.buffer.engine.domain.model;

public class LeadData {
    private String leadId;
    private String firstName;
    private String lastName;
    private String email;
    private String company;

    public LeadData(String leadId, String firstName, String lastName, String email, String company) {
        this.leadId = leadId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.company = company;
    }

    public String getLeadId() {
        return leadId;
    }

    public void setLeadId(String leadId) {
        this.leadId = leadId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

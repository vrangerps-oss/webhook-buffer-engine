package com.vrangerps.webhook.buffer.engine.adapter.inbound;

import com.vrangerps.webhook.buffer.engine.domain.model.LeadData;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/leads")
public class LeadDataController {

    LeadDataService leadDataService;

    @PostMapping
    public ResponseEntity<String> publishLeads(@RequestBody List<LeadData> leadDataList) {
        try{
            leadDataService.receiveLeadEvent(leadDataList);
            return ResponseEntity.accepted().body("Leads received successfully");
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Failed to receive Leads");
        }
    }

}

package com.stg.coding.controller;

import com.stg.coding.entity.PolicyRenewal;
import com.stg.coding.service.PolicyRenewalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/policy-renewals")
public class PolicyRenewalController {

    @Autowired
    private PolicyRenewalService policyRenewalService;

    @PostMapping
    public ResponseEntity<PolicyRenewal> createPolicyRenewal(@RequestBody PolicyRenewal policyRenewal) {
        PolicyRenewal createdPolicyRenewal = policyRenewalService.createPolicyRenewal(policyRenewal);
        return new ResponseEntity<>(createdPolicyRenewal, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PolicyRenewal>> getAllPolicyRenewals() {
        List<PolicyRenewal> policyRenewals = policyRenewalService.getAllPolicyRenewals();
        return new ResponseEntity<>(policyRenewals, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PolicyRenewal> getPolicyRenewalById(@PathVariable("id") Long id) {
        PolicyRenewal policyRenewal = policyRenewalService.getPolicyRenewalById(id);
        if (policyRenewal != null) {
            return new ResponseEntity<>(policyRenewal, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Implement other CRUD methods (PUT, DELETE) as needed
}


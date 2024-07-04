package com.stg.coding.service;

import com.stg.coding.entity.PolicyRenewal;

import java.util.List;

public interface PolicyRenewalService {
    PolicyRenewal createPolicyRenewal(PolicyRenewal policyRenewal);
    List<PolicyRenewal> getAllPolicyRenewals();
    PolicyRenewal getPolicyRenewalById(Long id);

}

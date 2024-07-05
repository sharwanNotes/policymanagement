package com.stg.coding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.stg.coding.entity.PolicyRenewal;
import com.stg.coding.repository.PolicyRenewalRepository;
@Service
public class PolicyRenewalServiceImpl implements PolicyRenewalService {

    @Autowired
    private PolicyRenewalRepository policyRenewalRepository;

    @Override
    public PolicyRenewal createPolicyRenewal(PolicyRenewal policyRenewal) {
        return policyRenewalRepository.save(policyRenewal);
    }

    @Override
    public List<PolicyRenewal> getAllPolicyRenewals() {
        return policyRenewalRepository.findAll();
    }

    @Override
    public PolicyRenewal getPolicyRenewalById(Long id) {
        Optional<PolicyRenewal> optionalPolicyRenewal = policyRenewalRepository.findById(id);
        return optionalPolicyRenewal.orElse(null);
    }

    // Implement other service methods as needed
}
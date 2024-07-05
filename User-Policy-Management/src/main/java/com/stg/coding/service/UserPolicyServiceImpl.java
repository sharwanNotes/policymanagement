package com.stg.coding.service;

import com.stg.coding.entity.UserPolicy;
import com.stg.coding.repository.UserPolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserPolicyServiceImpl implements UserPolicyService {

    @Autowired
    private UserPolicyRepository userPolicyRepository;

    @Override
    public UserPolicy createUserPolicy(UserPolicy userPolicy) {
        return userPolicyRepository.save(userPolicy);
    }

    @Override
    public List<UserPolicy> getAllUserPolicies() {
        return userPolicyRepository.findAll();
    }

    @Override
    public UserPolicy getUserPolicyById(Long id) {
        Optional<UserPolicy> optionalUserPolicy = userPolicyRepository.findById(id);
        return optionalUserPolicy.orElse(null);
    }


}

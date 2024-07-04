package com.stg.coding.service;

import com.stg.coding.entity.UserPolicy;

import java.util.List;

public interface UserPolicyService {
    UserPolicy createUserPolicy(UserPolicy userPolicy);
    List<UserPolicy> getAllUserPolicies();
    UserPolicy getUserPolicyById(Long id);
}

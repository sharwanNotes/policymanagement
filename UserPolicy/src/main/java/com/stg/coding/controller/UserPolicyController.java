package com.stg.coding.controller;

import com.stg.coding.entity.UserPolicy;
import com.stg.coding.service.UserPolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-policies")
public class UserPolicyController {

    @Autowired
    private UserPolicyService userPolicyService;

    @PostMapping
    public ResponseEntity<UserPolicy> createUserPolicy(@RequestBody UserPolicy userPolicy) {
        UserPolicy createdUserPolicy = userPolicyService.createUserPolicy(userPolicy);
        return new ResponseEntity<>(createdUserPolicy, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserPolicy>> getAllUserPolicies() {
        List<UserPolicy> userPolicies = userPolicyService.getAllUserPolicies();
        return new ResponseEntity<>(userPolicies, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserPolicy> getUserPolicyById(@PathVariable("id") Long id) {
        UserPolicy userPolicy = userPolicyService.getUserPolicyById(id);
        if (userPolicy != null) {
            return new ResponseEntity<>(userPolicy, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Implement other CRUD methods (PUT, DELETE) as needed
}

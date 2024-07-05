package com.stg.coding.repository;

import com.stg.coding.entity.PolicyRenewal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRenewalRepository extends JpaRepository<PolicyRenewal, Long> {

}
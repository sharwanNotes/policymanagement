package com.stg.coding.repository;

import com.stg.coding.entity.UserPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPolicyRepository extends JpaRepository<UserPolicy, Long> {

}

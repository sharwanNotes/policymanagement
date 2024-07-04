package com.stg.coding.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PolicyTypes")
public class PolicyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyTypeId;

    @Column(nullable = false)
    private String typeName;

    @Column(nullable = false)
    private String description;

    @OneToMany(mappedBy = "policyType", cascade = CascadeType.ALL)
    private Set<Policy> policies;
}

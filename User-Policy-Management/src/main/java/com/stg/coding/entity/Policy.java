package com.stg.coding.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Policies")
public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long policyId;

    @Column(nullable = false, unique = true)
    private String policyNumber;

    @Column(nullable = false)
    private String policyName;

    @Column(nullable = false)
    private BigDecimal premiumAmount;

    @Column(nullable = false)
    private String paymentMode;

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date maturityDate;

    @Column(nullable = false)
    private BigDecimal maturityAmount;

    @Column(nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "agent_id", nullable = false)
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "policy_type_id", nullable = false)
    private PolicyType policyType;

    @Column(nullable = false)
    private Date createdAt;

    @Column(nullable = false)
    private Date updatedAt;

    @OneToMany(mappedBy = "policy", cascade = CascadeType.ALL)
    private Set<UserPolicy> userPolicies;
}

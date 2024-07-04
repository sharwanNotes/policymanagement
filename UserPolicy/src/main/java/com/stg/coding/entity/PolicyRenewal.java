package com.stg.coding.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PolicyRenewals")
public class PolicyRenewal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long renewalId;

    @ManyToOne
    @JoinColumn(name = "user_policy_id", nullable = false)
    private UserPolicy userPolicy;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(nullable = false)
    private String period;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private LocalDateTime requestedAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
}

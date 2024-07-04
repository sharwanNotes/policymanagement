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
@Table(name = "Territories")
public class Territory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long territoryId;

    @Column(nullable = false)
    private String territoryName;

    @OneToMany(mappedBy = "territory", cascade = CascadeType.ALL)
    private Set<Agent> agents;
}

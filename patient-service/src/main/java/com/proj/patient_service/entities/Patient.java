package com.proj.patient_service.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

@Entity
@Table(name = "patients")
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String fullName;

    @Column(length = 64)
    private String gender; // or enum if preferred

    @Column(length = 20)
    private String phone;

    @Column(length = 160, unique = true)
    private String email;

    @Column(length = 240)
    private String address;

    private java.time.LocalDate dateOfBirth;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    private Instant updatedAt;
}

package com.ITPM.springbootbackend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "member_assesment")
public class MemberAssement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectType;
    private String assesmentName;

    @Lob
    private byte[] assesment;
}

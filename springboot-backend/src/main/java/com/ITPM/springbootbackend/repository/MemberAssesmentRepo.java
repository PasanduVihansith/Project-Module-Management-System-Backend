package com.ITPM.springbootbackend.repository;

import com.ITPM.springbootbackend.model.MemberAssement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberAssesmentRepo extends JpaRepository<MemberAssement , Long> {
}

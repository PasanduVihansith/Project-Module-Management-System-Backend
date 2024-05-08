package com.ITPM.springbootbackend.repository;

import com.ITPM.springbootbackend.model.presentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PresentationRepositary extends JpaRepository<presentation,Long> {



    @Query("SELECT DISTINCT p.tital FROM presentation p WHERE p.ID = :id")
    List<String> findUniqueTitlesForPresentation(@Param("id") Long id);

    @Query("SELECT DISTINCT p.examinar1 FROM presentation p WHERE p.ID = :id " +
            "UNION SELECT DISTINCT p.examinar2 FROM presentation p WHERE p.ID = :id " +
            "UNION SELECT DISTINCT p.examinar3 FROM presentation p WHERE p.ID = :id")
    List<String> findUniqueExaminersForPresentation(@Param("id") Long id);




}

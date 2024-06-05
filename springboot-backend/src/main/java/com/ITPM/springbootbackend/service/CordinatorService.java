package com.ITPM.springbootbackend.service;


import com.ITPM.springbootbackend.dto.AssesmentRequest;
import com.ITPM.springbootbackend.exception.AssessmentUploadException;
import com.ITPM.springbootbackend.model.CordinatorAssesment;

public interface CordinatorService {
    CordinatorAssesment save(AssesmentRequest assessmentRequest) throws AssessmentUploadException;
}

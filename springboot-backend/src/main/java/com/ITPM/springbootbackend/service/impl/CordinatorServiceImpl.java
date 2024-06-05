package com.ITPM.springbootbackend.service.impl;

import com.ITPM.springbootbackend.dto.AssesmentRequest;
import com.ITPM.springbootbackend.exception.AssessmentUploadException;
import com.ITPM.springbootbackend.model.CordinatorAssesment;
import com.ITPM.springbootbackend.repository.CordinatorAssesmentRepo;
import com.ITPM.springbootbackend.service.CordinatorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;

@Service
@AllArgsConstructor
public class CordinatorServiceImpl implements CordinatorService {

    private CordinatorAssesmentRepo cordinatorAssesmentRepo;

    @Override
    public CordinatorAssesment save(AssesmentRequest assessmentRequest) throws AssessmentUploadException {

        CordinatorAssesment cordinatorAssesment = new CordinatorAssesment();



        return null;

    }

//    private final CordinatorAssesmentRepo cordinatorAssesmentRepo;
//
//    @Override
//    public CordinatorAssesment save(AssesmentRequest assessmentRequest) throws AssessmentUploadException {
//        CordinatorAssesment coordinatorAssessment = new CordinatorAssesment();
//        coordinatorAssessment.setProjectType(assessmentRequest.getProjectType());
//        coordinatorAssessment.setAssesmentName(assessmentRequest.getAssesmentName());
//        MultipartFile assessment = assessmentRequest.getAssesment();
//        if (assessment != null && !assessment.isEmpty()) {
//            try {
//                coordinatorAssessment.setAssesment(assessment.getBytes());
//            } catch (IOException e) {
//                // Throw a custom exception
//                throw new AssessmentUploadException("Failed to save assessment: " + e.getMessage());
//            }
//        }
//        return cordinatorAssesmentRepo.save(coordinatorAssessment);
//    }
}
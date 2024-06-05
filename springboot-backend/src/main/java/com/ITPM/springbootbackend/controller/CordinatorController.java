//package com.ITPM.springbootbackend.controller;
//
//import com.ITPM.springbootbackend.dto.AssesmentRequest;
//import com.ITPM.springbootbackend.exception.AssessmentUploadException;
//import com.ITPM.springbootbackend.model.CordinatorAssesment;
//import com.ITPM.springbootbackend.service.CordinatorService;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@AllArgsConstructor
//@CrossOrigin("http://localhost:3000")
//public class CordinatorController {
//
//    CordinatorService cordinatorService;
//
//
//
//
//    @PostMapping("/assessment")
//    public ResponseEntity<?> saveAssessment(@ModelAttribute AssesmentRequest request) throws AssessmentUploadException {
//        try {
//            CordinatorAssesment assessment = cordinatorService.save(request);
//            return ResponseEntity.ok(assessment);
//        } catch (AssessmentUploadException e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
//        }
//    }
//}

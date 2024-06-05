package com.ITPM.springbootbackend.service;

import com.ITPM.springbootbackend.dto.AssesmentRequest;
import com.ITPM.springbootbackend.model.MemberAssement;

public interface MemberService {

    MemberAssement addAssesment(AssesmentRequest assesmentRequest);
}

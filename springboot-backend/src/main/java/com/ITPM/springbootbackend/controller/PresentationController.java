package com.ITPM.springbootbackend.controller;

import com.ITPM.springbootbackend.exception.ResourseNotFoundExeption;
import com.ITPM.springbootbackend.model.presentation;
import com.ITPM.springbootbackend.repository.PresentationRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/presentationshedu")
@CrossOrigin("http://localhost:3001")
public class PresentationController {

    @Autowired
    private PresentationRepositary PresentationShedule;


    @GetMapping("/")
    public List<presentation> getAllshedules() {
        return PresentationShedule.findAll(); // Notice the lowercase 'p'
    }

    @PostMapping("/p")
    public presentation createPresentationShedule(@RequestBody presentation PresentShedule) {
        return  PresentationShedule.save(PresentShedule);
    }

    //
    @GetMapping("/{id}")
    public ResponseEntity<presentation> getPresentationID(@PathVariable long id){
        presentation presentation=PresentationShedule.findById(id).orElseThrow(() -> new ResourseNotFoundExeption("prsentation not exist with id:" +id));
        return ResponseEntity.ok(presentation);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<presentation> updateprsentation(@PathVariable long id,@RequestBody presentation prsentDetails) {
        presentation updatepresentation = PresentationShedule.findById(id)
                .orElseThrow(() -> new ResourseNotFoundExeption("Employee not exist with id: " + id));

        updatepresentation.setProjectgroup(prsentDetails.getProjectgroup());
        updatepresentation.setTital(prsentDetails.getTital());
        updatepresentation.setDate(prsentDetails.getDate());
        updatepresentation.setVenue(prsentDetails.getVenue());
        updatepresentation.setTime(prsentDetails.getTime());
        updatepresentation.setExaminar1(prsentDetails.getExaminar1());
        updatepresentation.setExaminar2(prsentDetails.getExaminar2());
        updatepresentation.setExaminar3(prsentDetails.getExaminar3());


        PresentationShedule.save(updatepresentation);

        return ResponseEntity.ok(updatepresentation);
    }


    // build delete employee REST API
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deletePresent(@PathVariable long id){

        presentation presentation = PresentationShedule.findById(id)
                .orElseThrow(() -> new ResourseNotFoundExeption("Employee not exist with id: " + id));

        PresentationShedule.delete(presentation);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/{id}/titles")
    public ResponseEntity<List<String>> getUniqueTitlesForPresentation(@PathVariable long id) {
        List<String> titles = PresentationShedule.findUniqueTitlesForPresentation(id);
        return new ResponseEntity<>(titles, HttpStatus.OK);
    }

    @GetMapping("/{id}/examiners")
    public ResponseEntity<List<String>> getUniqueExaminersForPresentation(@PathVariable long id) {
        List<String> examiners = PresentationShedule.findUniqueExaminersForPresentation(id);
        return new ResponseEntity<>(examiners, HttpStatus.OK);
    }




}

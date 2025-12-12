package com.ai.research_assistant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/research")
@CrossOrigin(origins="*")
@AllArgsConstructor
public class ResearchController {

    @Autowired
    private final ResearchService researchService;

    @PostMapping("/process")
    public ResponseEntity<String> processContent(){
        return new ResponseEntity<>("null",HttpStatus.OK);
    }

}

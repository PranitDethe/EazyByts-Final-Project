package com.PranitDethe.FitnessPlatform.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PranitDethe.FitnessPlatform.model.MembershipForm;
import com.PranitDethe.FitnessPlatform.service.MembershipFormService;

@RestController
@RequestMapping("/api")
public class MembershipFormController {

    @Autowired
    private MembershipFormService service;

    @PostMapping("/submit-form")
    public ResponseEntity<Map<String, String>> submitForm(@RequestBody MembershipForm membershipForm) {
        service.save(membershipForm);

        // Return success message in JSON format
        Map<String, String> response = new HashMap<>();
        response.put("success", "Form submitted successfully");
        return ResponseEntity.ok(response);
    }
}
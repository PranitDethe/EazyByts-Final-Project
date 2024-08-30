package com.PranitDethe.FitnessPlatform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PranitDethe.FitnessPlatform.model.ContactMessage;
import com.PranitDethe.FitnessPlatform.service.ContactService;

@RestController
@RequestMapping("/api/contact")
public class ContactController {
    @Autowired
    private ContactService service;

    @PostMapping("/send")
    public ResponseEntity<String> sendContactMessage(@RequestBody ContactMessage message) {
        service.saveContactMessage(message);
        return ResponseEntity.ok("Message received!");
    }
}
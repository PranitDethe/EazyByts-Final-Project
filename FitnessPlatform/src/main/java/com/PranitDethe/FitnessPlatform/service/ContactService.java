package com.PranitDethe.FitnessPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PranitDethe.FitnessPlatform.model.ContactMessage;
import com.PranitDethe.FitnessPlatform.repository.ContactMessageRepository;

@Service
public class ContactService {
    @Autowired
    private ContactMessageRepository repository;

    public void saveContactMessage(ContactMessage message) {
        repository.save(message);
    }
}
package com.PranitDethe.FitnessPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PranitDethe.FitnessPlatform.model.MembershipForm;
import com.PranitDethe.FitnessPlatform.repository.MembershipFormRepository;

@Service
public class MembershipFormService {

    @Autowired
    private MembershipFormRepository repository;

    public MembershipForm save(MembershipForm membershipForm) {
        return repository.save(membershipForm);
    }
}
package com.PranitDethe.FitnessPlatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PranitDethe.FitnessPlatform.model.UserPlan;
import com.PranitDethe.FitnessPlatform.repository.UserPlanRepository;

@Service
public class UserPlanService {

    @Autowired
    private UserPlanRepository userPlanRepository;

    public UserPlan saveUserPlan(UserPlan userPlan) {
        return userPlanRepository.save(userPlan);
    }
}

package com.PranitDethe.FitnessPlatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PranitDethe.FitnessPlatform.model.WorkoutPlan;
import com.PranitDethe.FitnessPlatform.repository.WorkoutPlanRepository;

@Service
public class WorkoutPlanService {

    @Autowired
    private WorkoutPlanRepository workoutPlanRepository;

    public List<WorkoutPlan> getAllWorkoutPlans() {
        return workoutPlanRepository.findAll();
    }

    public WorkoutPlan getWorkoutPlanById(Long id) {
        return workoutPlanRepository.findById(id).orElse(null);
    }

    public WorkoutPlan saveWorkoutPlan(WorkoutPlan workoutPlan) {
        return workoutPlanRepository.save(workoutPlan);
    }

    public void deleteWorkoutPlan(Long id) {
        workoutPlanRepository.deleteById(id);
    }

    public List<WorkoutPlan> searchPlansByTitle(String title) {
        return workoutPlanRepository.findByTitleContaining(title);
    }
}
package com.PranitDethe.FitnessPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.PranitDethe.FitnessPlatform.model.UserPlan;
import com.PranitDethe.FitnessPlatform.model.WorkoutPlan;
import com.PranitDethe.FitnessPlatform.service.UserPlanService;
import com.PranitDethe.FitnessPlatform.service.WorkoutPlanService;

@RestController
@RequestMapping("/api/workout-plans")
public class WorkoutPlanController {

    @Autowired
    private WorkoutPlanService workoutPlanService;

    @Autowired
    private UserPlanService userPlanService;

    @GetMapping
    public List<WorkoutPlan> getAllWorkoutPlans() {
        return workoutPlanService.getAllWorkoutPlans();
    }

    @GetMapping("/{id}")
    public WorkoutPlan getWorkoutPlanById(@PathVariable Long id) {
        return workoutPlanService.getWorkoutPlanById(id);
    }

    @PostMapping
    public WorkoutPlan createWorkoutPlan(@RequestBody WorkoutPlan workoutPlan) {
        return workoutPlanService.saveWorkoutPlan(workoutPlan);
    }

    @PutMapping("/{id}")
    public WorkoutPlan updateWorkoutPlan(@PathVariable Long id, @RequestBody WorkoutPlan workoutPlan) {
        workoutPlan.setId(id);
        return workoutPlanService.saveWorkoutPlan(workoutPlan);
    }

    @DeleteMapping("/{id}")
    public void deleteWorkoutPlan(@PathVariable Long id) {
        workoutPlanService.deleteWorkoutPlan(id);
    }

    @PostMapping("/user-plans")
    public UserPlan createUserPlan(@RequestBody UserPlan userPlan) {
        return userPlanService.saveUserPlan(userPlan);
    }

    @GetMapping("/search")
    public List<WorkoutPlan> searchPlans(@RequestParam String title) {
        return workoutPlanService.searchPlansByTitle(title);
    }
}
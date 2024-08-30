package com.PranitDethe.FitnessPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PranitDethe.FitnessPlatform.model.UserPlan;

@Repository
public interface UserPlanRepository extends JpaRepository<UserPlan, Long> {
}

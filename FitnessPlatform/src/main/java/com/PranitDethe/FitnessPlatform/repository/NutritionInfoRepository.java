package com.PranitDethe.FitnessPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PranitDethe.FitnessPlatform.model.NutritionInfo;

@Repository
public interface NutritionInfoRepository extends JpaRepository<NutritionInfo, Long> {
}

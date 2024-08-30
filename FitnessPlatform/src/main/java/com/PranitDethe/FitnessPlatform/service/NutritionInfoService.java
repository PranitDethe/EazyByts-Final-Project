package com.PranitDethe.FitnessPlatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PranitDethe.FitnessPlatform.model.NutritionInfo;
import com.PranitDethe.FitnessPlatform.repository.NutritionInfoRepository;

@Service
public class NutritionInfoService {

    @Autowired
    private NutritionInfoRepository nutritionInfoRepository;

    public List<NutritionInfo> getAllNutritionInfo() {
        return nutritionInfoRepository.findAll();
    }

    public NutritionInfo getNutritionInfoById(Long id) {
        return nutritionInfoRepository.findById(id).orElse(null);
    }

    public NutritionInfo saveNutritionInfo(NutritionInfo nutritionInfo) {
        return nutritionInfoRepository.save(nutritionInfo);
    }

    public void deleteNutritionInfo(Long id) {
        nutritionInfoRepository.deleteById(id);
    }
}
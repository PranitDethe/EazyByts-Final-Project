package com.PranitDethe.FitnessPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.PranitDethe.FitnessPlatform.model.NutritionInfo;
import com.PranitDethe.FitnessPlatform.service.NutritionInfoService;

@RestController
@RequestMapping("/api/nutrition-info")
public class NutritionInfoController {

    @Autowired
    private NutritionInfoService nutritionInfoService;

    @GetMapping
    public List<NutritionInfo> getAllNutritionInfo() {
        return nutritionInfoService.getAllNutritionInfo();
    }

    @GetMapping("/{id}")
    public NutritionInfo getNutritionInfoById(@PathVariable Long id) {
        return nutritionInfoService.getNutritionInfoById(id);
    }

    @PostMapping
    public NutritionInfo createNutritionInfo(@RequestBody NutritionInfo nutritionInfo) {
        return nutritionInfoService.saveNutritionInfo(nutritionInfo);
    }

    @DeleteMapping("/{id}")
    public void deleteNutritionInfo(@PathVariable Long id) {
        nutritionInfoService.deleteNutritionInfo(id);
    }
}
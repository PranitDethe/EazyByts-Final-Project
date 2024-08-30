package com.PranitDethe.FitnessPlatform.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NutritionInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String details;
    private String type; // e.g., "Pre-Workout", "Post-Workout", "Balanced Diet"
	public NutritionInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NutritionInfo(Long id, String title, String details, String type) {
		super();
		this.id = id;
		this.title = title;
		this.details = details;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

    // Constructors, getters, and setters
    
    
    
}
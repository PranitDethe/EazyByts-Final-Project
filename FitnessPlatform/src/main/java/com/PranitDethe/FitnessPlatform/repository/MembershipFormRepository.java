package com.PranitDethe.FitnessPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PranitDethe.FitnessPlatform.model.MembershipForm;

public interface MembershipFormRepository extends JpaRepository<MembershipForm, Long> {
}
package com.PranitDethe.FitnessPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PranitDethe.FitnessPlatform.model.ContactMessage;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
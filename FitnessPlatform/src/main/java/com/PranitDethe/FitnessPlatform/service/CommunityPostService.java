package com.PranitDethe.FitnessPlatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PranitDethe.FitnessPlatform.model.CommunityPost;
import com.PranitDethe.FitnessPlatform.repository.CommunityPostRepository;

@Service
public class CommunityPostService {

    @Autowired
    private CommunityPostRepository communityPostRepository;

    public List<CommunityPost> getAllCommunityPosts() {
        return communityPostRepository.findAll();
    }

    public CommunityPost getCommunityPostById(Long id) {
        return communityPostRepository.findById(id).orElse(null);
    }

    public CommunityPost saveCommunityPost(CommunityPost communityPost) {
        return communityPostRepository.save(communityPost);
    }

    public void deleteCommunityPost(Long id) {
        communityPostRepository.deleteById(id);
    }
}
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

import com.PranitDethe.FitnessPlatform.model.CommunityPost;
import com.PranitDethe.FitnessPlatform.service.CommunityPostService;
@RestController
@RequestMapping("/api/community-posts")
public class CommunityPostController {

    @Autowired
    private CommunityPostService communityPostService;

    @GetMapping
    public List<CommunityPost> getAllCommunityPosts() {
        return communityPostService.getAllCommunityPosts();
    }

    @GetMapping("/{id}")
    public CommunityPost getCommunityPostById(@PathVariable Long id) {
        return communityPostService.getCommunityPostById(id);
    }

    @PostMapping
    public CommunityPost createCommunityPost(@RequestBody CommunityPost communityPost) {
        return communityPostService.saveCommunityPost(communityPost);
    }

    @DeleteMapping("/{id}")
    public void deleteCommunityPost(@PathVariable Long id) {
        communityPostService.deleteCommunityPost(id);
    }
}
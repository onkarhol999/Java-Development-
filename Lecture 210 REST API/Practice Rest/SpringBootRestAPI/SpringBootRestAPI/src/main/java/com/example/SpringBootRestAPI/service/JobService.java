package com.example.SpringBootRestAPI.service;

import com.example.SpringBootRestAPI.model.JobPost;
import com.example.SpringBootRestAPI.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public List<JobPost> getAllJobs(){
        return repo.getAllJobs();
    }
}

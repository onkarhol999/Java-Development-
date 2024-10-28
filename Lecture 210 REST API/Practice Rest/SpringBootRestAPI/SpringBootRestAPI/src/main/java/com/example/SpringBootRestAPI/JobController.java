package com.example.SpringBootRestAPI;


import com.example.SpringBootRestAPI.model.JobPost;
import com.example.SpringBootRestAPI.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService service;

    @GetMapping("jobPost")
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }
}

package com.example.SpringBootRestAPI;


import com.example.SpringBootRestAPI.model.JobPost;
import com.example.SpringBootRestAPI.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
      return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")
    @ResponseBody
    public JobPost getJob(@PathVariable("postId") int postId){
        return service.getJob(postId);
    }

    @PostMapping("jobPost")
    @ResponseBody
    public void addJob(@RequestBody JobPost jobPost){
        service.addJobPost(jobPost);
    }

    @PutMapping("jobPost")
    @ResponseBody
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{postId}")
    @ResponseBody
    public String deleteJob(@PathVariable("postId") int postId){
        service.deleteJob(postId);
        return "Deleted";
    }
}

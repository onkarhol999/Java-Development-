package com.example.JobPortal;


import com.example.JobPortal.model.Job;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobController {
    private static final List<Job> jobList = new ArrayList<>();

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/addjob")
    public String addJob() {
        System.out.println("add job");
        return "addjob";
    }

    @PostMapping("/savejob")
    public String saveJob(@ModelAttribute Job job, Model model){
        jobList.add(job);
        System.out.println(jobList);
        model.addAttribute("job",job);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewAllJobs(@ModelAttribute Job job,Model model) {
        model.addAttribute("jobList", jobList);
        System.out.println(jobList);
        return "viewalljobs";
    }
}

package com.example.SpringBootRestAPI.repo;

import com.example.SpringBootRestAPI.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}


// ArrayList to store JobPost objects
//private final List<JobPost> jobs = new ArrayList<>();
//
//// Constructor: Injecting JobPost objects into ArrayList
//public JobRepo() {
//
//    // Java Developer Job Post
//    jobs.add(new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
//            List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")));
//
//    // Frontend Developer Job Post
//    jobs.add(new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
//            3, List.of("HTML", "CSS", "JavaScript", "React")));
//
//    // Data Scientist Job Post
//    jobs.add(new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
//            List.of("Python", "Machine Learning", "Data Analysis")));
//
//    // Network Engineer Job Post
//    jobs.add(new JobPost(4, "Network Engineer",
//            "Design and implement computer networks for efficient data communication", 5,
//            List.of("Networking", "Cisco", "Routing", "Switching")));
//
//    // Mobile App Developer Job Post
//    jobs.add(new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android", 3,
//            List.of("iOS Development", "Android Development", "Mobile App")));
//
//}
//
//// Method to return all JobPosts
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//// Method to save a job post object into ArrayList
//public void addJobPost(JobPost job) {
//    jobs.add(job);
//}
//
//// Method to retrieve a specific job post by ID
//public JobPost getJob(int postId) {
//    for (JobPost job : jobs) {
//        if (job.getPostId() == postId) {
//            return job;
//        }
//    }
//    return null; // Return null if not found
//}
//
//
//
//public void updateJob(JobPost jobPost) {
//    for (JobPost jobPost1 : jobs) {
//        if (jobPost1.getPostId() == jobPost.getPostId()) {
//            jobPost1.setPostProfile(jobPost.getPostProfile());
//            jobPost1.setPostDesc(jobPost.getPostDesc());
//            jobPost1.setReqExperience(jobPost.getReqExperience());
//            jobPost.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost : jobs){
//        if(jobPost.getPostId() == postId){
//            jobs.remove(jobPost);
//        }
//    }
//}
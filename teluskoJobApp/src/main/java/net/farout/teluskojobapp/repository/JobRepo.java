package net.farout.teluskojobapp.repository;

import net.farout.teluskojobapp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

   List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "Software Engineer", "Develop and maintain software applications.", 3, Arrays.asList("Java", "Spring Boot", "MySQL")),
                new JobPost(2, "Data Scientist", "Analyze and interpret complex data.", 2, Arrays.asList("Python", "Machine Learning", "Pandas")),
                new JobPost(3, "Frontend Developer", "Build and optimize user interfaces.", 1, Arrays.asList("HTML", "CSS", "JavaScript", "React")),
                new JobPost(4, "Backend Developer", "Design and implement server-side logic.", 4, Arrays.asList("Node.js", "Express", "MongoDB")),
                new JobPost(5, "DevOps Engineer", "Automate and improve development workflows.", 5, Arrays.asList("Docker", "Kubernetes", "AWS"))
            )
   );

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost jobPost) {
        jobs.add(jobPost);
        System.out.println(jobs);
    }
}

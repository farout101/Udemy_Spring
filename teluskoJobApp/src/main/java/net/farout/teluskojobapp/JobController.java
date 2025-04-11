package net.farout.teluskojobapp;

import org.springframework.ui.Model;
import net.farout.teluskojobapp.model.JobPost;
import net.farout.teluskojobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/addjob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost) {
        jobService.addJob(jobPost);
        return "success";
    }

    @GetMapping("/viewalljobs")
    public String viewJobs(Model m) {
        List<JobPost> jos = jobService.getAllJobs();
        m.addAttribute("jobPosts", jos);
        return "viewalljobs";
    }
}

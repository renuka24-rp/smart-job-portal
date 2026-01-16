import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
@CrossOrigin("*")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping
    public Job addJob(@RequestBody Job job) {
        return jobService.addJob(job);
    }

    @GetMapping
    public List<Job> getJobs() {
        return jobService.getAllJobs();
    }
}


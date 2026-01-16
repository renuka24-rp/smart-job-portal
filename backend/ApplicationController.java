import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apply")
@CrossOrigin("*")
public class ApplicationController {

    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @PostMapping
    public Application apply(@RequestBody Application application) {
        return applicationService.apply(application);
    }
}


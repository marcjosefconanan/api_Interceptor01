package api_Interceptor01.api_Interceptor01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/legacy")
public class LegacyController {
    @GetMapping("/")
    public String getData(){
        return "This is just old code";
    }
}
package Web.com.WebList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServiceControllerHome {

    @GetMapping("/")
    public String homePage(){
        return "home";
    }
}

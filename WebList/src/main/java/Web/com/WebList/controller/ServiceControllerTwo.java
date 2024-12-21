package Web.com.WebList.controller;

import Web.com.WebList.db.Appointments;
import Web.com.WebList.repo.RepoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class ServiceControllerTwo {


    @Autowired
    public RepoRepository repository;



    @GetMapping("/appointments")
    public String getAppointments(Model model){
        model.addAttribute("appointments", new Appointments());
        return "/appointments";
    }


    @PostMapping("/appointments")
    public String Appointments(@RequestParam Long service_id,
                               @RequestParam String client_name,
                               @RequestParam LocalDateTime appointments_time,
                               @RequestParam String status){

        Appointments appointments = new Appointments();

        appointments.setAppointments_time(appointments_time);
        appointments.setService_id(service_id);
        appointments.setStatus(status);
        appointments.setClient_name(client_name);

        repository.save(appointments);

        return "redirect:/appointments";

    }

}

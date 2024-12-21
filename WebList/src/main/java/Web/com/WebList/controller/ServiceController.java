package Web.com.WebList.controller;

import Web.com.WebList.db.Service;

import Web.com.WebList.repo.RepoRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ServiceController {

    @Autowired
    private RepoRepositoryService repoRepositoryService;


//    @GetMapping("/api")
//    public String addModel(Model model){
//        model.addAttribute("title", "Главная страница");
//        return "hello";
//
//    }

    @GetMapping("/addService")
    public String getService(Model model){
        model.addAttribute("service", new Service());
        return "addService";
    }


    @PostMapping("/addService")
    public String addService(@RequestParam String name, @RequestParam String duration) {
        Service service = new Service();
        service.setName(name);
        service.setDuration(duration);
        repoRepositoryService.save(service);
        return "redirect:/addService";


    }

//    public ServiceController(MainController mainController){
//        this.mainController = mainController;
//    }
//
//
//    @PostMapping("/add/services")
//    public ResponseEntity<Service> addService(@RequestParam Service service){
//        Service savedService = mainController.saveService(service);
//        return ResponseEntity.status(HttpStatus.CREATED).body(savedService);
//    }

    @GetMapping("/getService")
    public String GetService(Model model){
        model.addAttribute("title","hello");
        return "home";
    }


    }



package neeraj.springframework.myspringpetclinic.controller;

import neeraj.springframework.myspringpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {
    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping("/vets")
    public String vetIndex(Model model) {
        model.addAttribute("vets",vetService.findAll());
        return "vets/index.html";
    }
}

package neeraj.springframework.myspringpetclinic.controller;

import neeraj.springframework.myspringpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping("/owners")
    public String ownerIndex(Model model){
        model.addAttribute("ownerObj",ownerService.findAll());
        return "owner/index.html";
    }
}

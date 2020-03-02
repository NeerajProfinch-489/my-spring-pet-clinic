package neeraj.springframework.myspringpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {
    @RequestMapping("/vets")
    public String vetIndex(){
        return "vets/index.html";
    }
}

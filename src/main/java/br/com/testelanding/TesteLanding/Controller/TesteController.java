package br.com.testelanding.TesteLanding.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TesteController {
    @GetMapping
    public String mostrarHome(){
        return "index";
    }
}

package br.com.testelanding.TesteLanding.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TesteController {
    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @GetMapping("/simulador")
    public String simuladorPagina() {return "simulador"; }

    @GetMapping("/resposta")
    public String listarBancos() {return "resposta"; }
}

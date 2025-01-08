package br.com.ebiblia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.ebiblia.Service.BibliaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
@RequestMapping("biblias")
public class BibliaController {

    private BibliaService bibliaService;

    public BibliaController(BibliaService bibliaService) {
        this.bibliaService = bibliaService;
    }



    @GetMapping
    public String showListBible(Model model) {
        model.addAttribute("biblias", bibliaService.findAll());
        return "biblias";
    }
    

   
}

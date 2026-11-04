package com.hq.verse.controller;

import com.hq.verse.model.Categoria;
import com.hq.verse.repository.CategoriaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/categorias")
@Controller
public class CategoriaController {

    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String listar(Model model){
        model.addAttribute("categorias",repository.findAll());

        return "categorias/lista";
    }

    @GetMapping("/nova")
    public String novo(Model model){
        model.addAttribute("categoria",new Categoria());

        return "categorias/formulario";
    }

    @PostMapping
    public String salvar(Categoria categoria){
        repository.save(categoria);

        return "redirect:/categorias";
    }
}

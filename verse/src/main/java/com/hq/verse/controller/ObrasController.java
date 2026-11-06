package com.hq.verse.controller;

import com.hq.verse.model.Categoria;
import com.hq.verse.model.Obras;
import com.hq.verse.repository.CategoriaRepository;
import com.hq.verse.repository.ObrasRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/obras")
@Controller
public class ObrasController {
    private final ObrasRepository obrasRepository;
    private final CategoriaRepository categoriaRepository;

    public ObrasController(ObrasRepository obrasRepository, CategoriaRepository categoriaRepository) {
        this.obrasRepository = obrasRepository;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("obras", obrasRepository.findAll());

        return "obras/lista";
    }

    @GetMapping("/nova")
    public String novo(Model model) {
        model.addAttribute("obra", new Obras());
        model.addAttribute("categorias", categoriaRepository.findAll());

        return "obras/formulario";
    }
}

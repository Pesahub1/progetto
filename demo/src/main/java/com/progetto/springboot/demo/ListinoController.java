package com.progetto.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.NoSuchElementException;

@Controller
public class ListinoController {
    private final ListinoRepository repository;

    public ListinoController(ListinoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("listini", repository.findAll());
        return "index";
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("listino", new Listino());
        return "form";
    }

    @PostMapping("/save")
    public String saveListino(@ModelAttribute Listino listino) {
        repository.save(listino);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editListino(@PathVariable Long id, Model model) {
        model.addAttribute("listino", repository.findById(id).orElseThrow(() -> new NoSuchElementException("Listino not found with id: " + id)));
        return "form";
    }
}
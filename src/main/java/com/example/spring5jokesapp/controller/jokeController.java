package com.example.spring5jokesapp.controller;

import com.example.spring5jokesapp.service.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokeController {

    JokesService jokesService;

    public jokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }


  @RequestMapping("/jokes")
  public String getJoke(Model model){

        model.addAttribute("joke”", jokesService.getRandomQuote());
        return "jokes/index";
    }
}

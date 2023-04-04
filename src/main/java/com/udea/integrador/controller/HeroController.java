package com.udea.integrador.controller;

import com.udea.integrador.model.Hero;
import com.udea.integrador.service.HeroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    private HeroService heroService;

    public HeroController(HeroService heroService){
        this.heroService = heroService;
    }
    @GetMapping("{id}")
    ResponseEntity<Hero> getHero(@PathVariable Integer id){

        return ResponseEntity.ok(heroService.getHero(id));
    }

}

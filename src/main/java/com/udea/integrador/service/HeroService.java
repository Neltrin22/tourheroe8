package com.udea.integrador.service;

import com.udea.integrador.model.Hero;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HeroService {

    public Hero getHero(Integer id){
        return new Hero(1, "Sipder-Man");
    }
}

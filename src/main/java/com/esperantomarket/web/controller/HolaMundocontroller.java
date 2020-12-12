package com.esperantomarket.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludo")
public class HolaMundocontroller {

    @GetMapping("/hola")
    public String saludo() {
        return "Nunca pares de aprender";
    }
}

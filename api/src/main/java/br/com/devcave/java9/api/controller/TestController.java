package br.com.devcave.java9.api.controller;

import java.time.LocalDate;

import br.com.devcave.java9.api.dto.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public Pessoa test () {
        return new Pessoa(10L, "Leonardo Ferreira", LocalDate.of(1995, 12, 26));
    }
}

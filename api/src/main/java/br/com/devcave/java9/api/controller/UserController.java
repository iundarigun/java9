package br.com.devcave.java9.api.controller;

import java.time.LocalDate;

import br.com.devcave.java9.api.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

    @GetMapping("cpf/{cpf}")
    public User getByCPF (@PathVariable final String cpf) {
        return new User(10L, "Leonardo Ferreira",
                LocalDate.of(1995, 12, 26),
                cpf);
    }
}

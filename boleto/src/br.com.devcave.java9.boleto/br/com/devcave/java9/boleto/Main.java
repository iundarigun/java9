package br.com.devcave.java9.boleto;

import java.io.IOException;
import java.math.BigDecimal;

import br.com.devcave.java9.boleto.model.User;
import br.com.devcave.java9.boleto.repository.UserRepository;
import br.com.devcave.java9.boleto.service.PrintService;

public class Main {

    public static void main (String... args) throws IOException {
        final UserRepository userRepository = new UserRepository();
        User user = userRepository.getUser("12345678");
        final PrintService printService = new PrintService();
        final String file = printService.generateFile(user, new BigDecimal(450.75));
        System.out.println(user.getName());
    }
}

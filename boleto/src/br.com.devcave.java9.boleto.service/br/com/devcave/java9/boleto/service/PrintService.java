package br.com.devcave.java9.boleto.service;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

import br.com.devcave.java9.boleto.model.User;

public class PrintService {

    public String generateFile (User user, BigDecimal value) throws IOException {

        final String fileName = "boleto.txt";
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            fileWriter.write("user: " + user.getName());
            fileWriter.write("document: " + user.getDocument());
            fileWriter.write("value: " + value);

        }
        return fileName;
    }
}

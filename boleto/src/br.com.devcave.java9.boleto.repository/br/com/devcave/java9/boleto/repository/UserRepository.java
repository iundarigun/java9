package br.com.devcave.java9.boleto.repository;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import br.com.devcave.java9.boleto.model.User;
import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

public class UserRepository {

    public User getUser (String document) {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest request = null;
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI("http://localhost:2612/users/cpf/" + document))
                    .GET().build();
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandler.asString());
            final User user = jsonToUser(response.body());
            user.setDocument(document);
            return user;
        } catch (URISyntaxException | InterruptedException | IOException e) {
            // erro
        }

        return null;
    }

    private User jsonToUser (String json) {
        User user = new User();
        final int nameInit = json.indexOf("name\":");
        final int nameFinal = json.substring(nameInit).indexOf(",");
        user.setName(json.substring(nameInit + 7, nameInit + nameFinal - 1));
        return user;
    }
}

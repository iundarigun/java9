package br.com.devcave.java9;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

/**
 * Compilar:
 * javac --add-modules jdk.incubator.httpclient src/br/com/devcave/java9/Http2.java
 * java  --add-modules jdk.incubator.httpclient -cp src br.com.devcave.java9.Http2
 */
public class Http2 {

    public static void main (String... args) throws Exception {
        httpClientTest();
        httpClientAsyncTest();
    }

    private static void httpClientTest () throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .header("Accept", "plain/text")
                .uri(new URI("http://www.google.com.br"))
                .GET().build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandler.asString());

        System.out.println("content : " + response.body());
    }

    private static void httpClientAsyncTest ()
            throws URISyntaxException, InterruptedException, ExecutionException {
        HttpClient httpClient = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .header("Accept", "plain/text")
                .uri(new URI("http://www.google.com.br"))
                .GET().build();

        CompletableFuture<HttpResponse<String>> response = httpClient
                .sendAsync(request, HttpResponse.BodyHandler.asString());

        System.out.println("content : " + response.get().body());
    }
}



package no.ss.workshop.http2;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.util.List;
import java.util.Map;

public class HttpTest {
    public static void tryVg() {
        try {
            HttpClient httpClient = HttpClient.newHttpClient(); //Create a HttpClient
            //System.out.println(httpClient.version());
            HttpRequest httpRequest = HttpRequest.newBuilder().uri(new URI("http://www.vondess.com/mannen/api")).GET().build(); //Create a GET request for the given URI
            Map<String, List<String>> headers = httpRequest.headers().map();
            headers.forEach((key, value) -> System.out.println(key + "-" + value));
            HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandler.asString());
            System.out.println(httpResponse.body());
        } catch (Exception e) {
            System.out.println("message " + e);
        }
    }
}

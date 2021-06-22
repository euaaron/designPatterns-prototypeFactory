package codes.euaaron.gifapi.shared.utils;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

@Component
public class HttpClient {
    private static final HttpClient instance = new HttpClient(new RestTemplateBuilder());

    private final RestTemplate rest;

    public HttpClient(RestTemplateBuilder restTemplateBuilder) {
        this.rest = restTemplateBuilder.build();
    }

    public static HttpClient getInstance() { return instance; }

    public String doGet(String url) {
        try {
            return this.rest.getForObject(url, String.class);
        } catch (HttpStatusCodeException ex) {
            System.out.println(ex.getStatusCode().toString());
            System.out.println(ex.getResponseBodyAsString());
            return null;
        }
    }
}

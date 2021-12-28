import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClienteHttp {
    public static void main(String[] args) throws IOException, InterruptedException {
        var url = "https://postman-echo.com/get";

        try {
            HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI(url))
            .GET()
            .build();

            HttpClient httpClient = HttpClient.newHttpClient();
            var response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            
            System.out.println(response.body());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}

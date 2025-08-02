import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

        import java.net.http.*;
        import java.net.URI;

public class GetRequestTest {

    @Test
    public void testSimpleGet() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://postman-echo.com/get"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        assertEquals(200, response.statusCode());
        assertTrue(response.body().contains("\"url\""));
    }
}

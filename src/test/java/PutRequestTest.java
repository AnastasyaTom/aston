import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.net.http.*;
import java.net.URI;

public class PutRequestTest {
    @Test
    public void testPutRequest() throws Exception {
        String jsonData = "{\"name\":\"John\",\"age\":30}";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://postman-echo.com/put"))
                .header("Content-Type", "application/json")
                .PUT(HttpRequest.BodyPublishers.ofString(jsonData))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        assertEquals(200, response.statusCode());

        assertTrue(response.body().contains("\"name\":\"John\""));
        assertTrue(response.body().contains("\"age\":30"));
    }
}

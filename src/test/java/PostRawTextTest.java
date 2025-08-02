import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.net.http.*;
import java.net.URI;

public class PostRawTextTest {

    @Test
    public void testPostRawText() throws Exception {
        String rawText = "Это тестовое сообщение";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://postman-echo.com/post"))
                .header("Content-Type", "text/plain")
                .POST(HttpRequest.BodyPublishers.ofString(rawText))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


        assertEquals(200, response.statusCode());

        assertTrue(response.body().contains(rawText));
    }
}

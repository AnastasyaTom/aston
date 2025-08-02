import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.net.http.*;
import java.net.URI;

public class PostFormDataTest {

    @Test
    public void testPostFormData() throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        String formData = "name=John&age=30";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://postman-echo.com/post"))
                .header("Content-Type", "application/x-www-form-urlencoded")
                .POST(HttpRequest.BodyPublishers.ofString(formData))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(200, response.statusCode());
        assertTrue(response.body().contains("\"name\":\"John\""));
        assertTrue(response.body().contains("\"age\":\"30\""));
    }
}

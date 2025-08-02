
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestPostRawText {
    public static void main(String[] args) {
        String url = "https://postman-echo.com/post";
        String rawText = "7. Убедитесь, что выбран формат **Text** для типа данных.";

        Response response = RestAssured.given()
                .header("Content-Type", "text/plain")
                .body(rawText)
                .post(url);

        System.out.println("Response: " + response.asString());
    }
}
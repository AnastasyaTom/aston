import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestPutRequest {
    public static void main(String[] args) {
        String url = "https://postman-echo.com/put";

        Response response = RestAssured.given()
                .contentType("application/json")
                .body("{\"ключ\":\"значение\"}")
                .put(url);

        System.out.println("Response: " + response.asString());
    }
}

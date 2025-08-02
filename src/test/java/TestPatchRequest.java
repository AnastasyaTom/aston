import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestPatchRequest{
    public static void main(String[] args) {
        String url = "https://postman-echo.com/patch";

        Response response = RestAssured.given()
                .contentType("application/json")
                .body("{\"ключ\":\"значение\"}")
                .patch(url);

        System.out.println("Response: " + response.asString());
    }
}

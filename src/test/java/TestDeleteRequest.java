
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestDeleteRequest {
    public static void main(String[] args) {
        String url = "https://postman-echo.com/delete";

        Response response = RestAssured.given()
                .delete(url);

        System.out.println("Response: " + response.asString());
    }
}
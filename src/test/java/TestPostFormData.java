
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestPostFormData {
    public static void main(String[] args) {
        String url = "https://postman-echo.com/post";

        Response response = RestAssured.given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("имя", "значение")
                .post(url);

        System.out.println("Response: " + response.asString());
    }
}

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import java.net.http.*;
import java.net.URI;

public class PostFormDataTest {

    @Test
    void postFormDataTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/x-www-form-urlencoded; charset=UTF-8")
                .formParam("username", "testUser")
                .formParam("email", "test@example.com")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.username", equalTo("testUser"))
                .body("form.email", equalTo("test@example.com"));
    }

}

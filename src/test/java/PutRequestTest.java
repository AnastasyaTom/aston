import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import java.net.http.*;
import java.net.URI;

public class PutRequestTest {
    @Test
    void putRequestTest() {
        String textPayload = "PUT request payload";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .queryParam("resourceId", "123")
                .body(textPayload)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("data", equalTo(textPayload))
                .body("args.resourceId", equalTo("123"));
    }
}

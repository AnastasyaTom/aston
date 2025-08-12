import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

import java.net.http.*;
import java.net.URI;

public class PostRawTextTest {

    @Test
    void postRawTextTest() {
        String textPayload = "Raw text payload";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .queryParam("queryParam", "testValue")
                .body(textPayload)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(textPayload))
                .body("args.queryParam", equalTo("testValue"))
                .body("headers.content-type", containsString("text/plain"));
    }
}

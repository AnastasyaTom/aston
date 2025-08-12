import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;
import java.net.http.*;
import java.net.URI;

public class DeleteRequestTest {

    @Test
    void deleteRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .queryParam("recordId", "789")
                .body("{\"confirmation\": \"true\"}")
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .body("args.recordId", equalTo("789"))
                .body("json.confirmation", equalTo("true"));
    }
}

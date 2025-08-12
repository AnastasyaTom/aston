import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PatchRequestTest {

    @Test

    void patchRequestTest() {
        String jsonPayload = "{\"status\": \"active\", \"enabled\": true}";

        given()
                .baseUri("https://postman-echo.com")
                .contentType("application/json")
                .body(jsonPayload)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("json.status", equalTo("active"))
                .body("json.enabled", equalTo(true));
    }

}

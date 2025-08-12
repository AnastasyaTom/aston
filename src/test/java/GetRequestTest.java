import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

        import java.net.http.*;
        import java.net.URI;

public class GetRequestTest {

    @Test
    void getRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("param1", "value1")
                .queryParam("param2", "value2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.param1", equalTo("value1"))
                .body("args.param2", equalTo("value2"))
                .body("headers.host", equalTo("postman-echo.com"))
                .body("url", containsString("/get?param1=value1&param2=value2"));
    }

}

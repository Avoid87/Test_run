package RestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class DraftRestAPI {

    @Test
    public void Login(){
        String jsonBody = "{\"password\":\"Default:xE78HzC3ZVkODA4FWTfQSXsaLUwSsCooWyYLUDnMEWhhNjUFJ4EscmXZovrKr/iQK4OMtxX3xT+epLzL7CklWPNGBQd54jBT0jCdTV5nyiM1fIb6369A+5SYTMUecdUQ3buqxvyBztpAGPkdMVg3OTACBDApL07qEncR0M/BoeB2dIMimEk6TrvQmyw3tt/yITvL4RohpDB9DbPP2olDHkY7Fu2u4qv5sE54vEZ/xEnY2T3rJLb0Q7qMhavKWhpAKGg3FJgfyBdxv0PDgeEUjqubrkYyB6JX/dwpOiN+Y3rB1aqIcsJMCtoirLajN6ATCjMOXKiK3jNY2nPLw0DcSQ==\",\"userName\":\"Default:vmo7AqxQ3MAtSWqgEaBB7N7LNYoj1/1AGNj7zNLrh022QbtpK93boVoeyhVtVT1m0YGqJI94n+JE0zRCSBA1TztoBLRT80b+PnpdUK8vJHRk6YHDiK/+fikvnIA5uuFAl8Fuhpd0kslzWHTWrXF9wsVjOeL/tWHk4+ZnXUasehqmy3aqV1eo4IKXEVvGAo+BhyhWF2rh+C4EqybRh6SuLXb0cUJHWewHD/C49NkhAh+O3Ysy9XHvVM4ye2NoYtfNycmy5qQ57huuf+zyiBrY0LDhJRyGhNOPG1EZFZEryDNn+kZf08KTOfOmGb9Ingkdnvhx2CKCfPFCRAHIy0hzxQ==\"}";
        given()
                .baseUri("https://broker2.rshb.ru/broker2sinvint")
                .header("Content-Type", "application/json")
                .header("X-DeviceType", "2")
                .header("X-DeviceName", "JavaAPI")
                .header("X-DeviceId", "Java_ID")
                .body(jsonBody)
                .when()
                .post("/api/v1/Auth/Login")
                .then()
                .log().all() // Для логирования всего ответа
                .statusCode(200);
    }
}

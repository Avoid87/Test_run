package Api;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class UserData {

    @Test
    public static void postRequest(){
        RestAssured.baseURI = "https://broker2.rshb.ru/broker2sinvint/api/v1/Auth/Login";
        given().urlEncodingEnabled(true);
        
    }


}
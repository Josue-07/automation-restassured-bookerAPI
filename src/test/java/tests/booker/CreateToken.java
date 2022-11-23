package tests.booker;

import core.BaseRequestSpecification;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class CreateToken extends BaseRequestSpecification {

    @Test
    @DisplayName("Gerar Token")
    public void obterBasicToken(){
        final Map<String,String> autentication = new HashMap<>();
        autentication.put("username","admin");
        autentication.put("password","password123");

        RestAssured.given()
                    .body(autentication)
                .when()
                    .post("/auth")
                .then()
                    .statusCode(HttpStatus.SC_OK);
    }
}

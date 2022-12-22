package core;

import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.*;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.*;
import org.junit.jupiter.api.*;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.lessThan;

public class BaseRequestSpecification implements Constantes {

    private static PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
    private static RequestSpecification reqSpec;
    private static ResponseSpecification respSpec;

    @BeforeAll
    public static void setup(){

        baseURI = BASE_URI;
        port = PORT;

        reqSpec = new RequestSpecBuilder()
                .log(LogDetail.ALL)
                .setContentType(CONTENT_TYPE)
                .setAccept("application/json")
                .build();

        respSpec = new ResponseSpecBuilder()
                .expectResponseTime(lessThan(TIMEOUT))
                .log(LogDetail.ALL)
                .build();

        requestSpecification = reqSpec;
        responseSpecification = respSpec;
    }
    @BeforeEach
    public void setAuth(){

        authScheme.setUserName("admin");
        authScheme.setPassword("password123");
        authentication = authScheme;
    }

}

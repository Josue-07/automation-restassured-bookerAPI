package core;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.lessThan;

public class BaseRequestSpecification implements Constantes {

    public static RequestSpecification reqSpec;
    public static ResponseSpecification respSpec;

    @BeforeAll
    public static void setup(){

        baseURI = BASE_URI;
        port = PORT;

        reqSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setAccept("application/json")
                .build();

        respSpec = new ResponseSpecBuilder()
                .expectResponseTime(lessThan(TIMEOUT))
                .log(LogDetail.ALL)
                .build();

        requestSpecification = reqSpec;
        responseSpecification = respSpec;

    }
}

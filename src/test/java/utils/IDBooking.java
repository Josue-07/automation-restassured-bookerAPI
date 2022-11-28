package utils;

import core.BaseRequestSpecification;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;

public class IDBooking extends BaseRequestSpecification {


    public static int getIDBooking() {
        ArrayList<Integer> ids = given()
                .pathParams("recurso", "booking")
                .when()
                .get("/{recurso}")
                .then()
                .statusCode(HttpStatus.SC_OK).extract().path("bookingid");
        return ids.get(0);
    }
}

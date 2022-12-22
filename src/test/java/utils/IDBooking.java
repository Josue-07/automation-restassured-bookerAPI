package utils;

import core.BaseRequestSpecification;
import org.apache.http.HttpStatus;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;


public class IDBooking extends BaseRequestSpecification {

    public static int id = (int) getIDBooking().get(0);
    public static ArrayList getIDBooking() {
        ArrayList ids = given()
                .pathParams("recurso", "booking")
                .when()
                .get("/{recurso}")
                .then()
                .statusCode(HttpStatus.SC_OK).extract().path("bookingid");

        return ids;
    }



}

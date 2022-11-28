package tests.booker;

import core.BaseRequestSpecification;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class GetBookingIDs extends BaseRequestSpecification {


    @Test
    @DisplayName("Listar IDs de Bookings")
    public void listarIDsDeBooking() {
//     Response response = request(Method.GET,"/booking");
//
//     final JsonPath jsonPath = response.jsonPath();
//     final String jsonString = jsonPath.getString("$");
//     assertNotNull(jsonString);
//     assertTrue(jsonString.contains("bookingid"));
        Response response = given()
                .pathParams("recurso", "booking")
                .when()
                .get("/{recurso}")
                .then()
                .statusCode(HttpStatus.SC_OK).extract().response();

        JsonPath jsonPath = response.jsonPath();
        String jsonString = jsonPath.getString("$");

        assertNotNull(jsonString);
        assertTrue(jsonString.contains("bookingid"));
    }

}

package tests.booker;

import core.BaseRequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;


public class GetBookingIDs extends BaseRequestSpecification {

    private final String RESOURCE_BOOKER_ID = "booking";

    @Test
    @DisplayName("Listar IDs de Bookings")
    public void listarIDsDeBooking() {
//     Response response = request(Method.GET,"/booking");
//
//     final JsonPath jsonPath = response.jsonPath();
//     final String jsonString = jsonPath.getString("$");
//     assertNotNull(jsonString);
//     assertTrue(jsonString.contains("bookingid"));
        given()
            .pathParams("recurso", RESOURCE_BOOKER_ID)
        .when()
            .get("/{recurso}")
        .then()
             .statusCode(HttpStatus.SC_OK);
    }
}

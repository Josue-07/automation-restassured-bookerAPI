package tests.booker;

import core.BaseRequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.IDBooking;

import static io.restassured.RestAssured.given;

public class GetBookingsByIDs extends BaseRequestSpecification {

    @Test
    @DisplayName("Procurar Livros por IDs")
    public void consultarBookingsPorIDs(){
                given()
                        .pathParams("recurso","booking")
                .when()
                    .get("/{recurso}/"+ IDBooking.getIDBooking())
                .then()
                    .statusCode(HttpStatus.SC_OK);

    }
}

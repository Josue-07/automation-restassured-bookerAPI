package tests.booker;

import core.BaseRequestSpecification;
import entities.NewBooking;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class CreateBooking extends BaseRequestSpecification {

    private final String RESOURCE_BOOKER_ID = "booking";

    @Test
    @DisplayName("Listar IDs de Bookings")
    public void listarIDsDeBooking() {

                given()
                    .body(NewBooking.criarNovoLivro())
                    .pathParams("recurso", RESOURCE_BOOKER_ID)
                .when()
                    .post("/{recurso}")
                .then()
                    .statusCode(HttpStatus.SC_OK);
    }
}

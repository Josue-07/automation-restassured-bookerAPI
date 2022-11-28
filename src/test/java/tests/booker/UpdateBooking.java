package tests.booker;

import core.BaseRequestSpecification;
import entities.PayLoads;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.IDBooking;

public class UpdateBooking extends BaseRequestSpecification {


    @Test
    @DisplayName("Alterar Informações de um Booking")
    public void atualizarInfoDeBooking() {
        RestAssured.given()
                //.auth().preemptive().basic("admin","password123")
                .body(PayLoads.atualizarBooking())
                .when()
                .put("/booking/"+ IDBooking.getIDBooking())
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}

package tests.booker;

import core.BaseRequestSpecification;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeleteBooking extends BaseRequestSpecification {

    @Test
    @DisplayName("Deletar um booking")
    public void apagarBookingByID(){
        RestAssured.given()

                .when()
                    .delete("booking/3337")
                .then()
                    .statusCode(HttpStatus.SC_CREATED);
    }
}

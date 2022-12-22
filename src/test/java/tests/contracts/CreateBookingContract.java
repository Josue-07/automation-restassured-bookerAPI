package tests.contracts;

import core.BaseRequestSpecification;
import entities.PayLoads;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.request;
import static io.restassured.RestAssured.requestSpecification;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CreateBookingContract extends BaseRequestSpecification {

    @Test
    @DisplayName("Validar Contrato criação de Booking")
    public void validarContratoCreateBooking(){
        requestSpecification.body(PayLoads.criarNewBooking());
        Response response = request(Method.POST,"/booking");
        assertEquals(HttpStatus.SC_OK,response.statusCode());
        assertNotNull(response);

        response.then()
                .body(matchesJsonSchemaInClasspath("schemas/createBookingSchema.json"));
    }
}

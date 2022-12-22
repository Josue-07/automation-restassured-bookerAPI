package tests.contracts;

import core.BaseRequestSpecification;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.request;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class GetBookingIDContract extends BaseRequestSpecification {

    @Test
    @DisplayName("Verificar Contrato de Booking IDs")
    public void validarContratoBookingID(){

        Response response = request(Method.GET,"/booking");
        Assertions.assertEquals(HttpStatus.SC_OK,response.statusCode());
        response.then().body(matchesJsonSchemaInClasspath("schemas/getBookingIDSchema.json"));
    }
}

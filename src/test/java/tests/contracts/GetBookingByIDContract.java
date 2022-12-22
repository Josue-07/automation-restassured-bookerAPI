package tests.contracts;

import core.BaseRequestSpecification;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.jupiter.api.Assertions.*;

public class GetBookingByIDContract extends BaseRequestSpecification {

    @Test

    @DisplayName("Validar contrato da lista de livros por ID")
    public void validarContratoBookingByID(){
        //requestSpecification.pathParams("id",IDBooking.getIDBooking());

        Response response = RestAssured.request(Method.GET,"/booking/{id}");
        assertNotNull(response,"Response não é Nula");
        assertEquals(HttpStatus.SC_OK,response.statusCode());
        response.then().body(matchesJsonSchemaInClasspath("schemas/getBookingByIDSchema.json"));


    }
}

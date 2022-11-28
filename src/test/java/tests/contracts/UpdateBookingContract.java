package tests.contracts;

import core.BaseRequestSpecification;
import entities.PayLoads;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.IDBooking;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.request;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UpdateBookingContract extends BaseRequestSpecification {

    @Test
    @DisplayName("Validar Contrato atualizar livro")
    public void validarContratoUpdateBooking() {

        requestSpecification.body(PayLoads.atualizarBooking())
                            .pathParams("id", IDBooking.getIDBooking());

        Response response = request(Method.PUT, "booking/{id}");
        assertEquals(HttpStatus.SC_OK,response.statusCode());
        assertNotNull(response);

        response.then().body(matchesJsonSchemaInClasspath("schemas/getBookingByIDSchema.json"));
    }
}

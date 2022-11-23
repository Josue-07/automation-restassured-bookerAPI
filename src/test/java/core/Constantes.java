package core;

import io.restassured.http.ContentType;

public interface Constantes {

    String BASE_URI = "https://restful-booker.herokuapp.com";
    Integer PORT = 443;

    ContentType CONTENT_TYPE = ContentType.JSON;
    Long TIMEOUT = 8000L;
}

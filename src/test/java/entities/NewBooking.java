package entities;

public class NewBooking {

    public static String criarNovoLivro(){
       return  "{\n" +
                "    \"firstname\" : \"Rafael\",\n" +
                "    \"lastname\" : \"Pereira\",\n" +
                "    \"totalprice\" : 350,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2022-01-01\",\n" +
                "        \"checkout\" : \"2022-09-08\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
    }
}

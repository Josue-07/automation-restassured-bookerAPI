package entities;

public class PayLoads {

    public static String criarNewBooking(){
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
    public static String atualizarBooking(){
        return "{\n" +
                "    \"firstname\": \"Pedro\",\n" +
                "    \"lastname\": \"Rocha\",\n" +
                "    \"totalprice\": 134,\n" +
                "    \"depositpaid\": true,\n" +
                "    \"bookingdates\": {\n" +
                "        \"checkin\": \"2018-01-01\",\n" +
                "        \"checkout\": \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\": \"Breakfast\"\n" +
                "}";
    }

}

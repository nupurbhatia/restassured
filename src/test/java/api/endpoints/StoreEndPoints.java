package api.endpoints;

import api.payload.store;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class StoreEndPoints {

    public static Response Createorder(store Payload)
    {
       Response response= given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(Payload)
                .when()
                .post(Routes.post_url);

       return response;


    }

    public static Response Getorder(Long orderid)
    {
        Response response= given()
                .pathParam("orderId",orderid)
                .accept(ContentType.JSON)
                .when()
                .get(Routes.get_url_order);

        return response;


    }

    public static Response Deleteorder(Long orderid)
    {
        Response response= given()
                .pathParam("orderId",orderid)
                .accept(ContentType.JSON)
                .when()
                .delete(Routes.delete_url);

        return response;


    }

    public static Response GetInventory()
    {
        Response response= given()
                .accept(ContentType.JSON)
                .when()
                .get(Routes.get_url_bystatus);

        return response;


    }


}

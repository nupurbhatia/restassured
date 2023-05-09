package api.tests;

import api.endpoints.StoreEndPoints;
import api.payload.store;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Storetest {

    store Payload;

    @BeforeTest
    public void SetupData() {
        Payload=new store();
        
        Payload.setId();
        Payload.setPetId();
        Payload.setQuantity();
        Payload.setComplete();
        Payload.setShipDate();
        Payload.setComplete();
        Payload.getId();
        Payload.getId();
        Payload.getPetId();
        Payload.getQuantity();
        Payload.getShipDate();
        Payload.getStatus();
        Payload.getComplete();
    }

    @Test
    public void testCreateorder() {
        Response response = StoreEndPoints.Createorder(Payload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Test
    public void testGetOrder() {
        Response response = StoreEndPoints.Getorder(StoreEndPoints.Createorder(Payload).jsonPath().get("id"));
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);


    }

    @Test
    public void testDeleteOrder() {
        Response response = StoreEndPoints.Deleteorder(StoreEndPoints.Createorder(Payload).jsonPath().get("id"));
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);

    }

    @Test
    public void testGetinventorystatus() {
        Response response = StoreEndPoints.GetInventory();
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);


    }


}

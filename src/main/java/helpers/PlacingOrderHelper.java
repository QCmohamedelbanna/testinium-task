package helpers;

import api_utils.Auth;
import io.restassured.response.Response;
import org.testng.Assert;
import serialization.PlacingOrderBody;

public class PlacingOrderHelper {

    Auth auth = new Auth();
    PlacingOrderBody placingOrderBody = new PlacingOrderBody();

    public void placingApetOrder(int id, int petId, int quantity, String shipDate, String status, boolean complete)
    {
        placingOrderBody.setId(id);
        placingOrderBody.setPetId(petId);
        placingOrderBody.setQuantity(quantity);
        placingOrderBody.setShipDate(shipDate);
        placingOrderBody.setStatus(status);
        placingOrderBody.setComplete(complete);

        Response getPlacingOrderApiResponse = auth.placingOrder(placingOrderBody);
        System.out.println(getPlacingOrderApiResponse.then().log().body());

        int statusCode = getPlacingOrderApiResponse.getStatusCode();
        System.out.println(statusCode);
        Assert.assertEquals(statusCode, 200, "API retrieved an Error !");

        String expectedId = getPlacingOrderApiResponse.getBody().jsonPath().getString("id");
        System.out.println(expectedId);
        Assert.assertNotNull(expectedId, "id is retrieved null");

        int expectedPetId = getPlacingOrderApiResponse.getBody().jsonPath().getInt("petId");
        System.out.println(expectedPetId);
        Assert.assertEquals(expectedPetId, petId, "Order is failed");

        boolean expectedComplete = getPlacingOrderApiResponse.getBody().jsonPath().getBoolean("complete");
        System.out.println(expectedComplete);
        Assert.assertTrue(expectedComplete);
    }
}

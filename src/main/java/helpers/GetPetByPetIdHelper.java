package helpers;

import api_utils.Auth;
import io.restassured.response.Response;
import org.testng.Assert;

public class GetPetByPetIdHelper{
    Auth auth = new Auth();

    public void getPetById(int petId){
        Response getPetDetails = auth.getPet(petId);
        //System.out.println(getPetDetails.then().log().body());

        int statusCode = getPetDetails.getStatusCode();
        Assert.assertEquals(statusCode,200, "API retrieved an Error!");

        int expectedId = getPetDetails.getBody().jsonPath().getInt("id");
        System.out.println(expectedId);
        Assert.assertEquals(expectedId,petId, "API didn't retrieve the selected Pet");

        String expectedCategoryName = getPetDetails.getBody().jsonPath().getString("category.name");
        System.out.println(expectedCategoryName);
        Assert.assertNotNull(expectedCategoryName);

    }
}

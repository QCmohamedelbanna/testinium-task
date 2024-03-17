package api_utils;

import io.restassured.response.Response;
import serialization.PlacingOrderBody;

public class Auth{

    ApiBase apiBase = new ApiBase();

    public Response placingOrder(PlacingOrderBody placingOrderBody){
        return apiBase.post(placingOrderBody,"/store/order");
    }

    public Response getPet(int petId){
        return apiBase.get("/pet/{petId}", petId);
    }
}

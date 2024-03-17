package api_utils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static api_utils.Config.uri;

public class ApiBase {

    public Response post (Object body, String endPoint){
        RestAssured.baseURI = uri;
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(body)
                .when()
                .post(endPoint)
                .then()
                .extract().response();
    }

    public Response get(String endPoint, int petId){
        RestAssured.baseURI = uri;
        return RestAssured
                .given()
                .contentType(ContentType.JSON)
                .when()
                .pathParams("petId",petId)
                .get(endPoint)
                .then()
                .extract().response();
    }
}

package apiTests;

import helpers.PlacingOrderHelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PlacingOrderApiTests {
    PlacingOrderHelper placingOrderHelper = new PlacingOrderHelper();


    @Test
    public void VerifyThatOrderIsPlacingSuccessfully(){
        placingOrderHelper.placingApetOrder(
                0,
                0,
                0,
                "2024-03-17T22:32:37.567Z",
                "placed",
                true
        );
    }
}

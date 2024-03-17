package apiTests;

import helpers.GetPetByPetIdHelper;
import org.testng.annotations.Test;

public class GettingPetDetailsTests {
    GetPetByPetIdHelper getPetByPetIdHelper = new GetPetByPetIdHelper();

    @Test
    public void checkPetDetailsResponse(){
        getPetByPetIdHelper.getPetById(1);
    }
}

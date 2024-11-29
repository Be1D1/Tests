package tests.userTests;

import model.userModel.ApiResponseModel;
import model.userModel.GetUserResponseModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import java.util.ArrayList;
import java.util.List;

public class GetUserTest extends BaseTest {


    /*@Test
    public void getUserByUserNameTest() {
        GetUserResponseModel model = USER_API.getUserByUserName("test13366");
        Assert.assertEquals(model.getUsername(), "test13366");
    }*/
    @Test
    public void postCreateListUser  () {
        GetUserResponseModel newUser  = new GetUserResponseModel(
                5, "52", "string", "string", "string", "52", "string", 0);
        List<GetUserResponseModel> userList = new ArrayList<>();
        userList.add(newUser);
        ApiResponseModel response = USER_API.postCreateListUser(userList);
        Assert.assertEquals(response.getCode(), "200");
    }
    @Test
    public void getUsername() {
        GetUserResponseModel model = USER_API.getUserName("di");
        Assert.assertEquals(model.getUsername(), "di");
    }
    @Test
    public void putUsername() {
        GetUserResponseModel newUser = new GetUserResponseModel(
                5, "52", "string", "string", "string", "52", "string", 0);
        ApiResponseModel model = USER_API.putUserName("52",newUser);
        Assert.assertEquals(model.getCode(), "200");
    }
    @Test
    public void deleteUser() {
        ApiResponseModel model = USER_API.deleteUser("52");
        Assert.assertEquals(model.getCode(), "200");
    }
    @Test
    public void getLogin() {
        ApiResponseModel model = USER_API.getLogin("52","52");
        Assert.assertEquals(model.getCode(), "200");
    }
    @Test
    public void getLogout() {
        ApiResponseModel model = USER_API.getLogout();
        Assert.assertEquals(model.getCode(), "200");
    }
    @Test
    public void postCreateArrayUser  () {
        GetUserResponseModel newUser  = new GetUserResponseModel(
                5, "52", "string", "string", "string", "52", "string", 0);
        List<GetUserResponseModel> userList = new ArrayList<>();
        userList.add(newUser);
        ApiResponseModel response = USER_API.postCreateArrayUser(userList);
        Assert.assertEquals(response.getCode(), "200");
    }
    @Test
    public void postCreateUser  () {
        GetUserResponseModel newUser  = new GetUserResponseModel(
                2, "di", "string", "string", "string", "ma", "string", 9);
        ApiResponseModel response = USER_API.postCreateUser(newUser);
        Assert.assertEquals(response.getCode(), "200");
    }
}

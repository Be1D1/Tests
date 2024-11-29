package api;

import io.restassured.http.ContentType;
import model.userModel.ApiResponseModel;
import model.userModel.GetUserResponseModel;

import java.util.List;

import static io.restassured.RestAssured.given;

public class UserApi {

    /*public GetUserResponseModel getUserByUserName(String userName) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .log().all()
                .get("/user/" + userName)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(GetUserResponseModel.class);
    }*/
    public ApiResponseModel postCreateListUser(List<GetUserResponseModel> getUserResponseModel) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .body(getUserResponseModel)
                .when()
                .log().all()
                .post("/user/createWithList")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(ApiResponseModel.class);
    }
    public GetUserResponseModel getUserName(String userName) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .log().all()
                .get("/user/" + userName)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(GetUserResponseModel.class);
    }
    public ApiResponseModel putUserName(String user,GetUserResponseModel userRequest) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .body(userRequest)
                .when()
                .log().all()
                .put("/user/" + user)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(ApiResponseModel.class);
    }
    public ApiResponseModel deleteUser(String user) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .log().all()
                .delete("/user/" + user)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(ApiResponseModel.class);
    }
    public ApiResponseModel getLogin(String userName, String password) {
        return given()
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .log().all()
                .get("/user/login?username=" + userName + "&password=" + password)
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(ApiResponseModel.class);
    }
    public ApiResponseModel getLogout() {
        return given()
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .when()
                .log().all()
                .get("/user/logout")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(ApiResponseModel.class);
    }
    public ApiResponseModel postCreateArrayUser(List<GetUserResponseModel> getUserResponseModel) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .body(getUserResponseModel)
                .when()
                .log().all()
                .post("/user/createWithArray")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(ApiResponseModel.class);
    }
    public ApiResponseModel postCreateUser(GetUserResponseModel CreateUser) {
        return given().
                contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2")
                .body(CreateUser)
                .when()
                .log().all()
                .post("/user")
                .then()
                .statusCode(200)
                .log().all()
                .extract().response().as(ApiResponseModel.class);
    }

}

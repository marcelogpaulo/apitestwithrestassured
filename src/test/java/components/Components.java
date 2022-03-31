package components;

import org.apache.http.HttpStatus;
import org.json.JSONObject;
import system.RestAssuredBase;

//import static io.restassured.RestAssured.given; -- refactor
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class Components {

    public Components(String url) {
        RestAssuredBase.setup(url);
    }

    public void endpointReturn() {
//        given().when().get().then().log().all(); -- refactor
        get()
                .then()
                .log()
                .all();
    }

    public void validationPath(String path, String value) {
//        given().when().get().then().body(path, is(value)); -- refactor
        get()
                .then()
                .body(path, is(value));
    }

    public void validationSchema() {
//        given().when().get().then().body(matchesJsonSchemaInClasspath("JsonValidation.json")); -- refactor
        get()
                .then()
                .body(matchesJsonSchemaInClasspath("JsonValidation.json"));
    }

    public void postEndpoint() {
        JSONObject json = new JSONObject();
        json.put("name", "Scorpions");
        json.put("job", "music");

        given()
                .body(json)
                .when()
                .post()
                .then()
                .statusCode(HttpStatus.SC_CREATED)
                .body(containsString("createdAt"));
    }

    public void updateEndpoint() {
        JSONObject json = new JSONObject();
        json.put("name", "ScorpionsXXX");
        json.put("job", "music_Rock");

        given()
                .body(json)
                .when()
                .put()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body(containsString("updatedAt"));
    }

    public void deleteEndpoint() {
        when()
                .delete()
                .then()
                .statusCode(HttpStatus.SC_NO_CONTENT);
    }

}

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Deneme {

    @Test

    public void Creat() {
        String postdata = "{\n" +
                "    \"firstName\": \"awds\",\n" +
                "    \"lastName\": \"awds\",\n" +
                "    \"username\": \"awdsw\",\n" +
                "    \"email\": \"awdswqer@witwiser.io\"\n" +
                "}";

        given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .header("Content-Type", "application/json")
                .header("host", "testing-app.witwiser.io")
                .body(postdata)
                .when()
                .post("https://testing-app.witwiser.io/api/v1/users")
                .then().statusCode(200)
        .log().all();

    }

    public void hata_verecek_olan(){
        String postdata = "{\n" +
                "    \"firstName\": \"Dogancan987\",\n" +
                "    \"lastName\": \"Uluocak987\",\n" +
                "    \"username\": \"testttt.user3\",\n" +
                "    \"email\": \"dgncn123.user3@witwiser.io\"\n" +
                "}";

        given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .header("Content-Type", "application/json")
                .header("host", "testing-app.witwiser.io")
                .body(postdata)
                .when()
                .post("https://testing-app.witwiser.io/api/v1/users")
                .then().statusCode(500);

    }

    @Test
    public void Getall() {

        given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .when()
                .get("https://testing-app.witwiser.io/api/v1/users/1ed96768-4dfa-4f29-ddf2-0311863230c5")
                .then()
                .statusCode(200)
                .log().all();
    }

}

package StepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class MyStepdefs {

    @Given("create user")
    public void usersGetInformationOnAProject(String projectName) throws IOException {
        String postdata = "{\n" +
                "    \"firstName\": \"Doğancan\",\n" +
                "    \"lastName\": \"Uluocak\",\n" +
                "    \"username\": \"dogancan.user10\",\n" +
                "    \"email\": \"dddgggnnn@witwiser.io\"\n" +
                "}";

        given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .header("Content-Type", "application/json")
                .header("host", "testing-app.witwiser.io")
                .body(postdata)
                .when()
                .post("https://testing-app.witwiser.io/api/v1/users")
                .then().statusCode(200);
    }

    @When("Connect the post url")
    public void connectThePostUrl() {
        System.out.printf("");
    }

    @Then("Get the post")
    public void getThePost() {
        System.out.printf("");

    }
}

import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.DeserializationFeature;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import model.Result;
import java.util.List;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;


public class ApiTest {

    @Test
    public void ApiTest() {

        String baseURI = "https://dummy.restapiexample.com/api/v1/employees";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.get("");

        JsonPath jsonPathEvaluator = response.jsonPath();

        List<Integer> alljson = jsonPathEvaluator.getList("data");
        System.out.println(alljson);
        for (int i = 0; i < alljson.size(); i++) {
            System.out.println(alljson.get(i));
        }
    }

    @Test
    public void Creat() {
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

    @Test
    public void Error_Code() {
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
                .then().statusCode(500);

    }

    @Test
    public void Getall() {
        given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .when()
                .get("https://testing-app.witwiser.io/api/v1/users/1ed95a53-86b4-5f69-ddf9-01f2d048822b")
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void Creat_Session() {
        String postdata = "{\r\n    \"candidates\": [\r\n        \"id:1ed876d4-a065-f779-d201-0300980c71a6\"\r\n    ]," +
                "\r\n    \"interviewer\": null," +
                "\r\n    \"periodStartDate\": \"2023-01-17T12:00:00Z\"," +
                "\r\n    \"periodEndDate\": \"2023-01-22T22:00:00Z\"," +
                "\r\n    \"interviewStartDate\": null," +
                "\r\n    \"examType\": \"TEST\"," +
                "\r\n    \"sessionTemplateId\": \"1ed8b70a-fb1b-35d9-d204-090228958efe\"," +
                "\r\n    \"informCandidate\": false,\r\n    \"assignmentType\": \"USER\"," +
                "\r\n    \"groupId\": null\r\n}";


        given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .header("Content-Type", "application/json")
                .header("host", "testing-app.witwiser.io")
                .body(postdata)
                .when()
                .post("https://testing-app.witwiser.io/api/v1/sessions")
                .then().statusCode(200);
    }

    @Test
    public void Failed_Session() {
        String postdata = "{\r\n    \"candidates\": [\r\n        \"id:1ed876d4-a065-f779-d201-0300980c71a6101\"\r\n    ]," +
                "\r\n    \"interviewer\": null," +
                "\r\n    \"periodStartDate\": \"2023-01-17T12:00:00Z\"," +
                "\r\n    \"periodEndDate\": \"2023-01-22T22:00:00Z\"," +
                "\r\n    \"interviewStartDate\": null," +
                "\r\n    \"examType\": \"TEST\"," +
                "\r\n    \"sessionTemplateId\": \"1ed8b70a-fb1b-35d9-d204-090228958efe\"," +
                "\r\n    \"informCandidate\": false,\r\n    \"assignmentType\": \"USER\"," +
                "\r\n    \"groupId\": null\r\n}";


        given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .header("Content-Type", "application/json")
                .header("host", "testing-app.witwiser.io")
                .body(postdata)
                .when()
                .post("https://testing-app.witwiser.io/api/v1/sessions")
                .then().statusCode(404);
    }



    @Test
    public void Control_Session() throws JsonProcessingException {
        String postdata = "{\r\n    \"testTakerEmail\": \"Test3@test.com\"\r\n}";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String postdatasf = given().header("secret_key", "3Uvz513R74CHPqS3of8r3wJkzJ3rndfp4T0STnH5bGo4VjQk4e2yx9Y0BrDgF9kEYmeYtW83Cp0zrQy5BMJhVxZEqWxAFlQmgO736ujwMhoH6U36ABL7EArnpzgQTo")
                .header("Content-Type", "application/json")
                .header("host", "testing-app.witwiser.io")
                .body(postdata)
                .when()
                .post("https://testing-app.witwiser.io/api/v1/sessions/getTestTakerSessions")
                .thenReturn().asString();

        Result user = objectMapper.reader()
                .forType(Result.class).readValue(postdatasf);

        System.out.println(user.getSessions().size());

    }

}
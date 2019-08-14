package apiTests;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CBProject {
    @Test
    public void studentList() {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        Assert.assertEquals(response.statusCode(), 200);

    }

    //Create a test
    //Hit API that gets only one student
    //Print out status and response in a string
    @Test
    public void OneStudentValidation() {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/55184");
        System.out.println(response.statusCode());
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        String name = jp.get("students[0].firstName");
        System.out.println(name);
        int num = jp.get("students[0].batch");
        System.out.println(num);
    }

    @Test
    public void ListValidation() {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.asString());
        JsonPath jp = response.jsonPath();
        List<String> subject = jp.get("subject");
        System.out.println(subject.size());
        for (String sub:subject) {
            System.out.println(sub);

        }
    }
}

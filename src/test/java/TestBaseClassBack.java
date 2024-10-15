
import Models.AbstractTest;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.specification.RequestSpecification;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.logging.Logger;

import static io.restassured.RestAssured.given;

public class TestBaseClassBack {
    static SoftAssertions softly;

    @AfterClass
    public void tearDown(){
    }


    private static RequestSpecification specReqLogger;

    @BeforeClass
    public static void beforeClass() {
        softly = new SoftAssertions();
        ObjectMapper objectMapper = new ObjectMapper()
                .registerModule(new JavaTimeModule())
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        objectMapper.setVisibility(PropertyAccessor.GETTER, JsonAutoDetect.Visibility.NONE);

        RestAssuredConfig config = RestAssuredConfig.config()
                .objectMapperConfig(ObjectMapperConfig.objectMapperConfig()
                        .jackson2ObjectMapperFactory((cls, charset) -> objectMapper));


        specReqLogger = new RequestSpecBuilder()
                .setConfig(config)
                .build();
    }



    public void getResponsePost(AbstractTest<?, ?, ?> test) {

        Object response = given()
                .log().all()
                .when()
                .header("Connection", "keep-alive")
                .accept("application/json")
                .contentType("application/json")
                .body(test.getRequestBody())
                .post(test.getUrl())
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .extract().response().as(test.getResponseClass());
        test.setResponse(response);
    }

}

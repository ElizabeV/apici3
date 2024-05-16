package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RequestPostTest {
    @Test
    void shouldReturnDataFromBody() {
        given()
                .baseUri("https://postman-echo.com")
                .body("ping")
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("ping"))
        ;
    }
}

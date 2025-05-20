package AprendendoApi;

import org.junit.Test;
import org.junit.runner.Request;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class AprendendoApiDog {

	private Request request;
	private Response response;

	//@Test
	public void consultarListaDog() {
		given().log().all().when().get("https://petstore.swagger.io/v2/pet/findByStatus?status=available").then().log()
				.all();

	}

	//@Test
	public void cadastrarDog() {
		given().log().all().contentType("application/json")
				.body("{\r\n" + "  \"id\":688 ,\r\n" + "  \"category\": {\r\n" + "    \"id\": 0,\r\n"
						+ "    \"name\": \"samuel\"\r\n" + "  },\r\n" + "  \"name\": \"leumas, Thor\",\r\n"
						+ "  \"photoUrls\": [\r\n" + "    \"string\"\r\n" + "  ],\r\n" + "  \"tags\": [\r\n"
						+ "    {\r\n" + "      \"id\": 0,\r\n" + "      \"name\": \"string\"\r\n" + "    }\r\n"
						+ "  ],\r\n" + "  \"status\": \"available\"\r\n" + "}")
				.when().post("https://petstore.swagger.io/v2/pet").then().log().all();

	
	}

	//@Test 
	public void editarDog() {
         given().log().all().contentType("application/json")
         .body("{\r\n"
         		+ "    \"id\": 544,\r\n"
         		+ "    \"category\": {\r\n"
         		+ "        \"id\": 0,\r\n"
         		+ "        \"name\": \"teste de edicao\"\r\n"
         		+ "    },\r\n"
         		+ "    \"name\": \"Flash code\",\r\n"
         		+ "    \"photoUrls\": [\r\n"
         		+ "        \"string\"\r\n"
         		+ "    ],\r\n"
         		+ "    \"tags\": [\r\n"
         		+ "        {\r\n"
         		+ "            \"id\": 0,\r\n"
         		+ "            \"name\": \"string\"\r\n"
         		+ "        }\r\n"
         		+ "    ],\r\n"
         		+ "    \"status\": \"available\"\r\n"
         		+ "}").when().put("https://petstore.swagger.io/v2/pet").then().log().all();
	}
     @Test
	public void deletarDog() {
		
		given().log().all().when().delete("https://petstore.swagger.io/v2/pet/688").then().log().all();
	}

}

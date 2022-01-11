package restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Exp_api {

	public static void main(String[] args) {
		 System.out.println("***Started******");
			//Sending the request and getting the response from the server
		Response rep = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22"); 
			int code = rep.statusCode();
			System.out.println(code);
			//Printing response time
			System.out.println(rep.getTime());
			//printing the details in JSON format
		Response repst = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
			String data = repst.asString();
			System.out.println(data);
			System.out.println("***Completed*****");
		 

	}

}

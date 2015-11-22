package webservices;

import javax.xml.ws.Endpoint;

public class RandomPublisher {

	public static void main(String[] args) {
		System.out.println("Random web service starting...");
		Random random = new Random();
		Endpoint.publish("http://localhost:8080/random", random);
	}

}

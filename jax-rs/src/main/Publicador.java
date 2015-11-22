package main;

import java.io.IOException;
import java.net.URI;

import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import com.sun.net.httpserver.HttpServer ;


public class Publicador {

	public static void main(String[] args) throws IllegalArgumentException, IOException {
		ResourceConfig rc = new ResourceConfig().packages(new String[]{"resources"});
		
		HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
	}

}

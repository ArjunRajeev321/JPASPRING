package com.example.demo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringBootDemo1Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBootDemo1Application.class,args);
		System.out.println("Hello");
//		openHomePage();
	}
	
	public static void openHomePage() {
		System.out.print("Opening Browser");
		String url = "http://localhost:8084/index";
		if(Desktop.isDesktopSupported()) {
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
				
			}
			catch (IOException | URISyntaxException e) {
				e.printStackTrace();
			}
			
		}
		else {
			Runtime runtime = Runtime.getRuntime();
			try {
				runtime.exec("rundll32 url.dl,FileProtocolHandler" + url);
				
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}

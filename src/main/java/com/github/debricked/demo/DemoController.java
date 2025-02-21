package com.github.debricked.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

@RestController
public class DemoController {

	@GetMapping("/")
	public String index() throws IOException {
		Document doc = Jsoup.connect("https://debricked.com/").get();
	
	        Elements loginButton = doc.select("div[class^=journey-button] > *:contains(Log in)");

		return "Please visit %s to log into Debricked!".formatted(loginButton.attr("href")); 
	}
}
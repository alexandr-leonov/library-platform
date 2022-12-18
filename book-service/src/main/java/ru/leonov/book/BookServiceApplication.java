package ru.leonov.book;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RequestMapping("/books")
public class BookServiceApplication {

	@Value("${properties.mark}")
	private String mark;
	@GetMapping("/")
	public String list() {
		return "book list " + mark;
	}

	@GetMapping("/{id}/author")
	public String bookAuthor(@PathVariable("id") String id) {
		return "Same author " + id;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

}

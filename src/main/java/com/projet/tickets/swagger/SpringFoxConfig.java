package com.projet.tickets.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SpringFoxConfig implements WebMvcConfigurer {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("com.projet.tickets.controller")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfo("Gestion Ticket REST API", "Web service pour la gestion des tickets simple.", "Version 1.0",
				"Terme of service", new Contact("Prisca HASINARIVELO", "Prisca", "priscahasinarivelo@gmail.com"),
				"Licence of API", "Pas encore eu une licence", Collections.emptyList());
	}
}

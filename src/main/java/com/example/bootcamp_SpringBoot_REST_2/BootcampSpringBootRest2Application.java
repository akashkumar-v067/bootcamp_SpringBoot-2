package com.example.bootcamp_SpringBoot_REST_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;
import java.util.ResourceBundle;

@SpringBootApplication
public class BootcampSpringBootRest2Application {
	public static void main(String[] args) {

		SpringApplication.run(BootcampSpringBootRest2Application.class, args);
	}
	@Bean
	public LocaleResolver LocaleResolver(){
		SessionLocaleResolver LocaleResolver=new SessionLocaleResolver();
		LocaleResolver.setDefaultLocale(Locale.US);
		return LocaleResolver;
	}
	@Bean
	public ResourceBundleMessageSource messageSource(){
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
        messageSource.setBasename("messages");
		return messageSource;
	}


}

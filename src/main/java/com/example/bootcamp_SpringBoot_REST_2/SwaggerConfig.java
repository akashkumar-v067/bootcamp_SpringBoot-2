package com.example.bootcamp_SpringBoot_REST_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.xml.bind.annotation.XmlType;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo
            ("Bootcamp Assignment",
                    "Bootcamp SpringBoot REST part 2 Assignment",
                    "1.0-snapshot","not available","Akash kumar","intelliJ IDE","licence 1.0");
    private static final Set<String> DEFAULT_PRODUCES = new HashSet<String>(Arrays.asList("Apllication/json","Apllication/xml"));

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES)
                .consumes(DEFAULT_PRODUCES)
                ;
    }

}

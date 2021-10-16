package com.example.bootcamp_SpringBoot_REST_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class GoodMorningController {
    @Autowired
    private MessageSource bundleMessageSource;

    //*Internationalization
    //
    //Add support for Internationalization in your application allowing messages to be shown in English, German and Swedish, keeping English as default.
    //
    //Create a GET request which takes "username" as param and shows a localized message "Hello Username". (Use parameters in message properties)

    @GetMapping(path = "/hello")
    public String GoodMorning(@RequestHeader(name = "locale", required=false) Locale locale){

        return bundleMessageSource.getMessage("Hello.message",null, locale);
    }


}
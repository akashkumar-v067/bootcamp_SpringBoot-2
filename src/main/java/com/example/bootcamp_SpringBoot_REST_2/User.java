package com.example.bootcamp_SpringBoot_REST_2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;

@ApiModel(description = "USER MODEL:All details about Users")
public class User {
    int ID;
    @ApiModelProperty(notes = "Name should not be null")
    String Name;

    String city;

    public User() {
    }

    public User(int ID, String name, String city) {
        this.ID = ID;
        Name = name;
        this.city = city;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

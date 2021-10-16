package com.example.bootcamp_SpringBoot_REST_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserData uData;


    //  *Content Negotiation

    //  give application/xml in Accept header for content negotiation
    //  3. Create POST Method to create user details which can accept XML for user creation.

    @PostMapping(path = "users/addUser")
    public String addUser(@RequestBody User user) {
        uData.addUser(user);
        return "user added successfully";
    }

    //  4. Create GET Method to fetch the list of users in XML format.

    @GetMapping(path = "users/getAllUser")
    public List<User> getalluser() {
        return uData.getAllUser();
    }


    //5. Delete method to delete user.

    @DeleteMapping(path="users/deleteUser/{id}")
    public String deleteById(@PathVariable int id){
        return uData.deleteUser(id);
    }





}

package com.example.bootcamp_SpringBoot_REST_2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserData {
    static List<User> list = new ArrayList<>();

    static {
        list.add(new User(110, "akash", "greater noida"));
        list.add(new User(111, "bhavya", "nainital"));
        list.add(new User(112, "deepak", "jaipur"));
        list.add(new User(113, "kushal", "aligarh"));
        list.add(new User(114, "pankaj", "noida"));
    }

    public List<User> getAllUser() {
        return list;
    }

    public void addUser(User user) {
        list.add(user);
    }

    public String deleteUser(int id) {
        for (User i : list) {
            if (i.getID() == id) {
                list.remove(i);
             return "User removed successfully";
            }
        }
        return "User not found";
    }
}
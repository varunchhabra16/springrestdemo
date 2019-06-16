package com.gfg.varunchhabra16.RESTDemo.controller;

import com.gfg.varunchhabra16.RESTDemo.model.User;


import com.gfg.varunchhabra16.RESTDemo.model.UserData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    HashMap<Long,User> userData = UserData.lMap;

    @GetMapping("/usersall")
    public List<User> getAllUsers(){


        List<User> myList = new ArrayList<>();

        for(Map.Entry<Long,User> myEntry : userData.entrySet()){

            User user = myEntry.getValue();

            myList.add(user);

        }

        System.out.println(myList);
        return myList;

    }


    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Long id){

        if(!userData.containsKey(id)){
            return null;
        }
        else{
            return userData.get(id);
        }

    }

    @PostMapping("/user")
    public Boolean createUser(@RequestBody User user){

        if(userData.containsKey(user.getId())){
            return false;
        }
        else{
            userData.put(user.getId(),user);
            return true;
        }

    }

    @PutMapping("/user")
    public Boolean updateUser(@RequestBody  User user){
        if(!userData.containsKey(user.getId())){
            return false;
        }
        else{
            userData.put(user.getId(),user);
            return true;
        }
    }


    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable  Long id){

        if(!userData.containsKey(id)){
            return false;
        }
        else{
            userData.remove(id);
            return true;
        }

    }

}

package com.gfg.varunchhabra16.RESTDemo.model;

import java.util.HashMap;

public class UserData {

    public static HashMap<Long,User> lMap = new HashMap<>();

    static {

        User user1 = new User("Varun","Chhabra",1l);
        User user2 = new User("Rahul","Jangra",2l);
        User user3 = new User("Amanjot","Singh",3l);
        User user4 = new User("Shivam","Sahrawat",4l);
        lMap.put(1l,user1);
        lMap.put(2l,user2);
        lMap.put(3l,user3);
        lMap.put(4l,user4);

    }


}

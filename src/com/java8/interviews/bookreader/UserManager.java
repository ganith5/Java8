package com.java8.interviews.bookreader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Pavithra Sachidananda on 1/6/18.
 */
public class UserManager {

    private Map<Long, User> userList;

    public UserManager() {
        userList = new HashMap<>();
    }

    public void createUser(User user) {
        if(!userList.containsKey(user.getUserId()))
            userList.put(user.getUserId(), user);
    }

    public void removeUser(User user) {
        userList.remove(user.getUserId());
    }
}

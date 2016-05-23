package com.crud.project.dao;

import com.crud.project.model.User;

import java.util.Date;
import java.util.List;

public interface UserDao {
    void addUser(User user);
    void updateUser(User user);
    void removeUser(int id);
    User getUser(int id);
    List<User> getUsers(Long page);
    List<User> getUsers(String name);

}

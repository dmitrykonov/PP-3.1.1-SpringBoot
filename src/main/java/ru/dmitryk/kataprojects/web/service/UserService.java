package ru.dmitryk.kataprojects.web.service;

import ru.dmitryk.kataprojects.web.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User getUserById(final int id);
    public void addUser(User user);
    public void deleteUser(int id);
    //public void updateUser(User updatedUser);
}

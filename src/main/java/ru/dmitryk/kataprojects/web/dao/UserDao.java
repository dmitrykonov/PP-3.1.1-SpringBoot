package ru.dmitryk.kataprojects.web.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.dmitryk.kataprojects.web.model.User;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

//    public List<User> getAllUsers();
//    public User getUserById(final int id);
//    public void addUser(User user);
//    public void deleteUser(int id);
   //public void updateUser(User updatedUser);

}

package ru.dmitryk.kataprojects.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.dmitryk.kataprojects.web.dao.UserDao;
import ru.dmitryk.kataprojects.web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getOne(id);
    }

    @Override
    public void addUser(User user) {
        userDao.save(user);
    }


    @Override
    public void deleteUser(int id) {
        userDao.deleteById(id);
    }

}

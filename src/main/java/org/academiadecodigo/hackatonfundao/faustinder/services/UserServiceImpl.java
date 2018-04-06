package org.academiadecodigo.hackatonfundao.faustinder.services;

import org.academiadecodigo.hackatonfundao.faustinder.controllers.RegisterController;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    private RegisterController registerController;

    @Override
    public void addUser(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }
}

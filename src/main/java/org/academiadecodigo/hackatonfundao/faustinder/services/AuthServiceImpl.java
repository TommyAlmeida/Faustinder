package org.academiadecodigo.hackatonfundao.faustinder.services;


import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;

public class AuthServiceImpl implements AuthService {


    private UserDao userDao;

    @Override
    public boolean authenticate(String name, String password) {
        User user = userDao.findByUsername(name);
        return user != null && user.getPassword().equals(password);
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}

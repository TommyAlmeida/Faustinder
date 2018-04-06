package org.academiadecodigo.hackatonfundao.faustinder.services;

import org.academiadecodigo.hackatonfundao.faustinder.controllers.RegisterController;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.FetishDao;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    private User currentUser;
    private FetishDao fetishDao;

    @Override
    public void addUser(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public User findByUsername(String username) {
        currentUser = userDao.findByUsername(username);
        return currentUser;
    }

    @Override
    public User getCurrentUser() {
        return currentUser;
    }


    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setFetishDao(FetishDao fetishDao) {
        this.fetishDao = fetishDao;
    }
}

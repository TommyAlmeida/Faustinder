package org.academiadecodigo.hackatonfundao.faustinder.services;

import org.academiadecodigo.hackatonfundao.faustinder.controllers.RegisterController;
import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    private User currentUser;

    @Override
    public void addUser(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public User findByUsername(String username) {

        currentUser = userDao.findByUsername(username);

        if( currentUser == null){
            return null;
        }

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

}

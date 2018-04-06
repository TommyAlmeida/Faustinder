package org.academiadecodigo.hackatonfundao.faustinder.services;

import org.academiadecodigo.hackatonfundao.faustinder.models.User;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.FetishDao;
import org.academiadecodigo.hackatonfundao.faustinder.persistence.dao.UserDao;
import org.hibernate.HibernateException;

import javax.persistence.NoResultException;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private User currentUser;
    private FetishDao fetishDao;

    @Override
    public void addUser(User user) {
        userDao.saveOrUpdate(user);
    }

    @Override
    public User findByUsername(String username) {
        try {
            currentUser = userDao.findByUsername(username);

            if (currentUser == null) {
                return null;
            }

            return currentUser;

        } catch (NoResultException e) {
            return null;
        }
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

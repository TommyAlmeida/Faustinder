package org.academiadecodigo.hackatonfundao.faustinder.persistence.dao;

import org.academiadecodigo.hackatonfundao.faustinder.models.User;


public class UserDao extends GenericDao<User> {


    public UserDao() {
        super(User.class);
    }
}

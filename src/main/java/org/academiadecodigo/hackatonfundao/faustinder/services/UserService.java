package org.academiadecodigo.hackatonfundao.faustinder.services;

import org.academiadecodigo.hackatonfundao.faustinder.models.User;

public interface UserService extends Service{

    void addUser(User user);


    /**
     * Returns user by username
     * @param username
     * @return
     */
    User findByUsername(String username);

    User getCurrentUser();

}

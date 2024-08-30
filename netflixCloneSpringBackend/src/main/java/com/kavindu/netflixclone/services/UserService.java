package com.kavindu.netflixclone.services;

import com.kavindu.netflixclone.entities.User;
import com.kavindu.netflixclone.exceptions.UserDetailsNotFoundException;

public interface UserService {
    User createUser(User user);
    User findUser(String id) throws UserDetailsNotFoundException;
   // List<String> moviesOfUser(String userId);
}

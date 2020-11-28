package ac3.mangavue.demo.service;

import ac3.mangavue.demo.dao.UserDao;
import ac3.mangavue.demo.exception.HttpStatus;
import ac3.mangavue.demo.exception.MangaException;
import ac3.mangavue.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Profile {

    @Autowired
    UserDao userDao;

    public User getUser(Long userId){
        User user = userDao.getUser(userId);
        if (user == null) throw new MangaException(HttpStatus.USER_NOT_FOUND);
         user = User.UserBuilder()
                .userId(user.getUserId())
                .username(user.getUsername())
                .email(user.getEmail())
                .build();
        return user;
    }

    public List<User> getAllUser(){
        return userDao.getAllUser();
    }

}

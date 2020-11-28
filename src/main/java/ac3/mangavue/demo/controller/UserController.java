package ac3.mangavue.demo.controller;

import ac3.mangavue.demo.adapter.response.ResponseWrapper;
import ac3.mangavue.demo.exception.HttpStatus;
import ac3.mangavue.demo.service.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/user")
public class UserController {

    @Autowired
    Profile profile;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUser(){
        return new ResponseWrapper().wrap(profile.getAllUser(), HttpStatus.GET_ALL_USERS);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable Long userId){
        return new ResponseWrapper().wrap(profile.getUser(userId), HttpStatus.GET_PROFILE);
    }
}

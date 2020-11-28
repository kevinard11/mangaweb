package ac3.mangavue.demo.Controller;

import ac3.mangavue.demo.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ac3.mangavue.demo.Model.User;

@RestController
public class AuthController {

    @Autowired
    UserDao userDao;
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
        
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUser(){
        return new ResponseEntity<>(userDao.getAllUser(), HttpStatus.OK);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.POST)
    public ResponseEntity<User> getUser(@PathVariable String id){
        return new ResponseEntity<>()
    }
}

package ac3.mangavue.demo.controller;

import ac3.mangavue.demo.adapter.response.ResponseWrapper;
import ac3.mangavue.demo.dao.UserDao;
import ac3.mangavue.demo.exception.HttpStatus;
import ac3.mangavue.demo.service.Authentication;
import org.json.simple.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ac3.mangavue.demo.model.User;

@RestController

public class AuthController {

    @Autowired
    Authentication authentication;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<?> helloWorld(){
        return new ResponseWrapper().wrap(null, HttpStatus.HELLO_WORLD);
    }

    @RequestMapping(value = "/auth/signup", method = RequestMethod.PUT)
    public ResponseEntity<?> signup(@RequestBody JSONObject register){
        return new ResponseWrapper().wrap(authentication.register(register), HttpStatus.REGISTER_SUCCESSFULL);
    }

    @RequestMapping(value = "/auth/signin", method = RequestMethod.POST)
    public ResponseEntity<?> signin (@RequestBody JSONObject login){
        return new ResponseWrapper().wrap(authentication.login(login), HttpStatus.LOGIN_SUCCESSFULL);
    }
}

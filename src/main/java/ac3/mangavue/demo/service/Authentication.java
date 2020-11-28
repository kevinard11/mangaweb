package ac3.mangavue.demo.service;

import ac3.mangavue.demo.dao.UserDao;
import ac3.mangavue.demo.exception.HttpStatus;
import ac3.mangavue.demo.exception.MangaException;
import ac3.mangavue.demo.adapter.encoder.PasswordEncoderGenerator;
import ac3.mangavue.demo.model.User;
import ac3.mangavue.demo.validation.Validation;
import org.json.simple.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@MapperScan("ac3.mangavue.demo.Dao")
public class Authentication {
    @Autowired
    UserDao userDao;

    @Autowired
    PasswordEncoderGenerator passwordEncoderGenerator;

    @Autowired
    Validation validation;

    public String register(JSONObject register){
        validation.registerValidation(register);
//        User user = User.RegisterBuilder()
//                .username((String) register.get("username"))
//                .email((String) register.get("email"))
//                .password(passwordEncoderGenerator.encode((String) register.get("password")))
//                .build();
//        userDao.register(user);
        return null;
    }

    public String login(JSONObject login){
        validation.loginValidation(login);
        return null;
    }
}

package ac3.mangavue.demo.validation;

import ac3.mangavue.demo.adapter.encoder.PasswordEncoderGenerator;
import ac3.mangavue.demo.dao.UserDao;
import ac3.mangavue.demo.exception.HttpStatus;
import ac3.mangavue.demo.exception.MangaException;
import ac3.mangavue.demo.model.User;
import org.json.simple.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@MapperScan("ac3.mangavue.demo.Dao")
public class Validation {

    @Autowired
    UserDao userDao;
    @Autowired
    PasswordEncoderGenerator passwordEncoderGenerator;

    public void registerValidation(JSONObject register){
        String username = (String) register.get("username");
        String email = (String) register.get("email");
        if(username.length() > 20 || username.length() < 1) throw new MangaException(HttpStatus.USERNAME_INVALID);
        if(email.length() == 0) throw new MangaException(HttpStatus.EMAIL_INVALID);
        if(userDao.getUserByUsername(username) > 0) throw new MangaException(HttpStatus.USERNAME_ALREADY_USED);
        if(userDao.getUserByEmail(email) > 0) throw new MangaException(HttpStatus.EMAIL_ALREADY_USED);
    }
    public void loginValidation(JSONObject login){
//        String username = (String) login.get("username");
//        if(userDao.login(username).isEmpty()) throw new MangaException( HttpStatus.USER_NOT_FOUND);
//        if(passwordEncoderGenerator.decode((String) login.get("password"), userDao.login(username)) == false){
//            throw new MangaException(HttpStatus.PASS_WRONG);
//        }
    }
}

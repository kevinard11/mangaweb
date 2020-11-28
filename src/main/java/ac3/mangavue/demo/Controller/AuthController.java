package ac3.mangavue.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ResponseEntity<?> helloWorld(){
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }
}

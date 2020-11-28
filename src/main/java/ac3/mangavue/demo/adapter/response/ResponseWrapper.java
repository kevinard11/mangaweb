package ac3.mangavue.demo.adapter.response;

import ac3.mangavue.demo.exception.HttpStatus;
import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;

public class ResponseWrapper {
    public static ResponseEntity<?> wrap(Object object, HttpStatus httpStatus){
        JSONObject response = new JSONObject();
        response.put("message", httpStatus.getStatus());
        response.put("data", object);
        return new ResponseEntity<>(response, httpStatus.getHttpStatus());
    }
}

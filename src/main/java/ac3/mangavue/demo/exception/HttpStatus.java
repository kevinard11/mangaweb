package ac3.mangavue.demo.exception;

public enum HttpStatus {

    HELLO_WORLD("000. Hello World", org.springframework.http.HttpStatus.OK),
    USERNAME_INVALID("Username invalid", org.springframework.http.HttpStatus.BAD_REQUEST),
    EMAIL_INVALID("Email invalid", org.springframework.http.HttpStatus.BAD_REQUEST),
    USERNAME_ALREADY_USED("Username already used", org.springframework.http.HttpStatus.BAD_REQUEST),
    EMAIL_ALREADY_USED("Email already used", org.springframework.http.HttpStatus.BAD_REQUEST),
    REGISTER_SUCCESSFULL("Register successfull", org.springframework.http.HttpStatus.ACCEPTED),
    USER_NOT_FOUND("User not found", org.springframework.http.HttpStatus.NOT_FOUND),
    PASS_WRONG("Password is incorrect", org.springframework.http.HttpStatus.BAD_REQUEST),
    LOGIN_SUCCESSFULL("Login successfull",org.springframework.http.HttpStatus.ACCEPTED),
    GET_PROFILE("User found", org.springframework.http.HttpStatus.FOUND),
    GET_ALL_USERS("Get all user successfull", org.springframework.http.HttpStatus.FOUND);

    private final String status;
    private final org.springframework.http.HttpStatus httpStatus;

    HttpStatus(String status, org.springframework.http.HttpStatus httpStatus) {
        this.status = status;
        this.httpStatus = httpStatus;
    }

    public String getStatus() {
        return status;
    }

    public org.springframework.http.HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

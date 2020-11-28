package ac3.mangavue.demo.model;

import lombok.*;

import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    private Long userId;

    @NotBlank
    private String username;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    public User(String username,String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User(Long userId, @NotBlank String username, @Email @NotBlank String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
    }

    public static RegisterBuilder RegisterBuilder(){
        return new RegisterBuilder();
    }

    public static class RegisterBuilder{
        private String username;
        private String email;
        private String password;

        public RegisterBuilder username(final String username){
            this.username = username;
            return this;
        }

        public RegisterBuilder email(final String email){
            this.email = email;
            return this;
        }

        public RegisterBuilder password(final String password){
            this.password = password;
            return this;
        }

        public User build(){
            return new User(username, email, password);
        }
    }

    public static UserBuilder UserBuilder(){
        return new UserBuilder();
    }

    public static class UserBuilder{
        private Long userId;
        private String username;
        private String email;

        public UserBuilder userId(final Long userId){
            this.userId = userId;
            return this;
        }

        public UserBuilder username(final String username){
            this.username = username;
            return this;
        }

        public UserBuilder email(final String email){
            this.email = email;
            return this;
        }

        public User build(){
            return new User(userId, username, email);
        }
    }
}

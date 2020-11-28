package ac3.mangavue.demo.dao;

import ac3.mangavue.demo.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserDao {

    final String getAllUser = "select user_id, username, email from users";
    @Select(getAllUser)
    @Results(value = {
            @Result(property = "userId", column = "user_id")
    })
    List<User> getAllUser();

    final String getUser = "select user_id, username, email from users where user_id = #{userId}";
    @Select(getUser)
    @Results(value = {
            @Result(property = "userId", column = "user_id")
    })
    User getUser(@Param("userId") Long userId);

    final String login = "select password from users where username = #{username}";
    @Select(login)
    String login(@Param("username") String username);

    final String register = "insert users(username, password, email) values (#{username}, #{password}, #{email})";
    @Insert(register)
    void register(User user);

    final String getUserByUsername = "select count(*) from users where username = #{username}";
    @Select(getUserByUsername)
    int getUserByUsername(@Param("username") String username);

    final String getUserByEmail = "select count(*) from users where email = #{email}";
    @Select(getUserByEmail)
    int getUserByEmail(@Param("email") String email);
}

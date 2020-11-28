package ac3.mangavue.demo.Dao;

import ac3.mangavue.demo.Model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    final String getAllUser = "select * from user";
    @Select(getAllUser)
    List<User> getAllUser();

    final String getUser = "select * from user where id = #{userId}";
    @Select(getUser)
    User getUser(@Param("userId") String userId);
}

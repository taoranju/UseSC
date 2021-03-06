package ustc.sse.dao;

import ustc.sse.domain.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author LRK
 * @project_name UseSC
 * @package_name ustc.sse.dao
 * @date 2018/11/28 16:18
 * @description God Bless, No Bug!
 */
public interface UserDao {

    User query(String sql);
    User getUserById(Integer id);
    User getUserByName(String name);
    Boolean insertUser(User user) throws SQLException;
    Boolean updateUser(User user);
    Boolean deleteUserByName(String userName);
    Boolean deleteUserById(Integer id);

    List<User> getUsers();
}

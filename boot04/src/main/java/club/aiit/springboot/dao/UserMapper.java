package club.aiit.springboot.dao;

import club.aiit.springboot.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@Mapper
public interface UserMapper {

    @Options(useGeneratedKeys = true,keyProperty = "user.id")
    @Insert("insert into user (id,code,name,password) value (#{user.id},#{user.code},#{user.name},#{user.password})")
    int insert(@Param("user") User user);

    @Delete("delete from user where id = #{id}")
    int delete(@Param("id")Integer id);

    int update(@Param("user")User user);

    @Select("select * from user where id = #{id}")
    User selectById(@Param("id")Integer id);

    @Select("select * from user")
    List<User> select();
}

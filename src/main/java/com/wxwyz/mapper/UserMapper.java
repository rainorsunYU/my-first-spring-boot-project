package com.wxwyz.mapper;

import com.wxwyz.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    List<User> queryAllUser();

    User queryOneUser(String username);

}

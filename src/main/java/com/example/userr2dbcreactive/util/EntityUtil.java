package com.example.userr2dbcreactive.util;

import com.example.userr2dbcreactive.dto.UserDto;
import com.example.userr2dbcreactive.entity.User;
import org.springframework.beans.BeanUtils;

public class EntityUtil {
    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }
    public static User toEntity(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return user;
    }
}

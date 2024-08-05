package org.nobita.springdtodemo.mapper;

import org.mapstruct.Mapper;
import org.nobita.springdtodemo.dto.UserResponse;
import org.nobita.springdtodemo.entity.UserEntity;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    List<UserResponse> toUserResponseList(List<UserEntity> userEntityList);
}

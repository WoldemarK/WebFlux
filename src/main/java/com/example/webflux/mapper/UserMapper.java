package com.example.webflux.mapper;

import com.example.webflux.dto.UserDto;
import com.example.webflux.entity.UserEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto map(UserEntity userEntity);

    @InheritInverseConfiguration
    UserEntity map(UserDto dto);
}

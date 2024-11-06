package com.vscode.java.mapper;

import org.mapstruct.Mapper;

import com.vscode.java.model.User;
import com.vscode.java.to.UserTO;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserTO map(User user);
}
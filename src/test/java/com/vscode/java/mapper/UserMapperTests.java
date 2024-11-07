package com.vscode.java.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.vscode.java.model.User;
import com.vscode.java.to.UserTO;

class UserMapperTests {  
  private UserMapper userMapper = new UserMapperImpl();

  @Test
  void testMap() {
    User user = new User();
    user.setId(1L);
    user.setUsername("vscodeJavaUser01");
    user.setPassword("1234");

    UserTO userTO = userMapper.map(user);

    assertNotNull(userTO);
    assertEquals(1L, userTO.getId());
    assertEquals("vscodeJavaUser01", userTO.getUsername());
    assertEquals("1234", userTO.getPassword());
  }
}

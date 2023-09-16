package com.zijin.usercenter;
import java.util.Date;

import com.zijin.usercenter.mapper.UserMapper;
import com.zijin.usercenter.model.domain.User;
import com.zijin.usercenter.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;
   @Test
   public void addUserTest(){
       User user =new User();
       user.setUsername("zijin");
       user.setUserAccount("123");
       user.setAvatarUrl("https://cdn.jsdelivr.net/gh/mzijin/picgodemo/img/xiaoyi.png");
       user.setGender(0);
       user.setUserPassword("xxx");
       user.setPhone("123");
       user.setEmail("456");
       boolean result = userService.save(user);
       System.out.println(user.getId());
       Assertions.assertTrue(result);
   }
   //用户注册test
   @Test
   void userRegister(){
       String userAccount="xiaochen";
       String userPassword="12345678";
       String checkPassword="12345678";
       String planetCode="1";
       long result = userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
       //断言，简单理解就是它会test你的结果是否跟预期一致，并且打印给你看
       Assertions.assertEquals(-1,result);



   }

}

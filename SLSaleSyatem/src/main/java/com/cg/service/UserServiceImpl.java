package com.cg.service;

import com.cg.entity.User;
import com.cg.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;
    @Override
    public User getLoginUser(User user) throws Exception {
        return userMapper.getLoginUser(user);
    }
}

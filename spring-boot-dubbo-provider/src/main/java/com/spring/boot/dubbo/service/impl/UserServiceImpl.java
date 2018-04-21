package com.spring.boot.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.spring.boot.dubbo.mapper.UserMapper;
import com.spring.dubbo.model.User;
import com.spring.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(application = "${dubbo.application.id}",
    protocol = "${dubbo.protocol.id}",
    registry = "${dubbo.registry.id}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User searchUser(int id) {
        return userMapper.getUser(id);
    }
}

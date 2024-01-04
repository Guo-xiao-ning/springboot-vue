package com.xiaoning.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoning.entity.User;
import com.xiaoning.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    public boolean saveUser(User user) {
        return saveOrUpdate(user);
    }

}

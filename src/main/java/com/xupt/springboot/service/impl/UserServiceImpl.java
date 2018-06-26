package com.xupt.springboot.service.impl;

import com.xupt.springboot.mapper.UserMapper;
import com.xupt.springboot.model.User;
import com.xupt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional      //本身使用Spring的事务注解处理
    @Override
    public Integer updateUserInfo(User user) {
        Integer count = userMapper.updateByPrimaryKeySelective(user);
        System.out.println("更新结果:" + count);        //结果是 1

        //除数不能为0，所以此处会抛出一个运行时异常
        int a = 10 / 0;

        return count;
    }

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }

    @Override
    public User getUserInfo(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }
}

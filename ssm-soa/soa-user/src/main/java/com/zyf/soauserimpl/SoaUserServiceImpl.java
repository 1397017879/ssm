package com.zyf.soauserimpl;

import com.zyf.domian.User;
import com.zyf.mapper.UserMapper;
import com.zyf.soa.user.SoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/30.
 */
@Service
public class SoaUserServiceImpl implements SoaUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll(){

        return userMapper.getAll();
    }
    @Override
    public void update(User user){

        userMapper.update(user);
    }
    @Override
    public User getUser(Long id){
        return userMapper.getUser(id);
    }
    @Override
    public void add(User user){
        userMapper.add(user);
    }

}

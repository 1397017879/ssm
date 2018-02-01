package com.zyf.serviceimpl;

import com.zyf.domian.User;
import com.zyf.mapper.UserMapper;
import com.zyf.service.IUserService;
import com.zyf.soa.user.SoaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/30.
 * @author ZYF_JOKER
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private SoaUserService soaUserService;
    @Autowired
    private UserMapper userMapper;

    @Override
    public void update(User user){

        soaUserService.update(user);
    }
    @Override
    public User getUser(Long id){

        return  soaUserService.getUser(id);
    }
    @Override
    public List<User> getAll(){

        return soaUserService.getAll();
    }
    @Override
    public void add(User user){

        soaUserService.add(user);
    }

}

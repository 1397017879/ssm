package com.zyf.soa.user;

import com.zyf.domian.User;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/30.
 */
public interface SoaUserService {

    public List<User> getAll();

    public void update(User user);

    public User getUser(Long id);

    public void add(User user);

}

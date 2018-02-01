package com.zyf.service;

import com.zyf.domian.User;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/30.
 */
public interface IUserService {
    public void update(User user);

    public User getUser(Long id);

    public List<User> getAll();
    public void add(User user);
}

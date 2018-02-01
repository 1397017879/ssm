package com.zyf.mapper;

import com.zyf.domian.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/30.
 */
@Repository
public interface UserMapper {

    public void update(User user);

    public User getUser(Long id);

    public List<User> getAll();

    public void add(User user);

}

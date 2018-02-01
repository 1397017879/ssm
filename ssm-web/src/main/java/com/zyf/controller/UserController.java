package com.zyf.controller;

import com.zyf.domian.User;
import com.zyf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/30.
 */
@Controller
@RequestMapping({"user"})
public class UserController {

    @Autowired
    private IUserService iUserService;

    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser(Long id){
        return iUserService.getUser(id);
    }

    @RequestMapping({"update"})
    @ResponseBody
    public void  update(User user){

        iUserService.update(user);
    }

    @RequestMapping({"getUserAll"})
    @ResponseBody
    public List<User> getUserAll(){
        return iUserService.getAll();
    }

    @RequestMapping({"add"})
    @ResponseBody
    public void add(User user){
        iUserService.add(user);
    }
}

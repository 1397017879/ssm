package com.zyf.domian;

/**
 * Created by ZYF_JOKER on 2018/1/30.
 */

public class User extends BaseDomain{

    private static final long serialVersionUID = 4478545505819136420L;
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

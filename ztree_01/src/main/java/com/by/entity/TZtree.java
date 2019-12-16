package com.by.entity;

import java.io.Serializable;

/**
 * (TZtree)实体类
 *
 * @author makejava
 * @since 2019-12-05 10:14:52
 */
public class TZtree implements Serializable {
    private static final long serialVersionUID = -14619834868538650L;
    
    private Integer id;
    
    private String name;
    
    private Integer pid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}
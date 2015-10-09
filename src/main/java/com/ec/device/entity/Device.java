package com.ec.device.entity;


import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * User: chaocui200783
 * Date: 14-10-23
 * Time: 上午11:04
 */
@Entity
@Table(name = "t_device")
public class Device implements Serializable {

    public interface DemoView {};

    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String username;
    private String password;

    @JsonView(Device.DemoView.class)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonView(Device.DemoView.class)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @JsonView(Device.DemoView.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

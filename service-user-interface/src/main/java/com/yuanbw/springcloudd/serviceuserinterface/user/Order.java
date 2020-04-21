package com.yuanbw.springcloudd.serviceuserinterface.user;

import lombok.Data;

import java.io.Serializable;

@Data
public class Order implements Serializable {
    private Integer id;
    private String name;
    private String orderNu;

}

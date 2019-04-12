package com.baizhi.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class Emp implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;


}
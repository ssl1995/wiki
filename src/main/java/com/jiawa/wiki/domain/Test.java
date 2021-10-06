package com.jiawa.wiki.domain;

/**
 * @author SongShengLin
 * @date 2021/10/6 3:54 下午
 * @description 持久层：也叫dao层、pojo层
 */
public class Test {
    public Integer id;
    public String name;

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
}

package com.freedom.mykafka;

import java.io.Serializable;

/**
 * @author ：wujie
 * @date ：Created in 2019/9/1 17:05
 * @description：消息实体类
 * @version: 1.0.0
 */

public class Message implements Serializable {
    private int id;
    private String name;
    private int age;

    public Message() {
    }

    public Message(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.udemy.Lamkhayarconsumer.json;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;

    private String firstname;

    private int age;

    @JsonProperty("name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @JsonProperty("age")
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  "name= " + name + " firstname = " + firstname + " age = " + age;

    }
}

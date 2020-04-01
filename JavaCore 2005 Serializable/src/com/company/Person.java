package com.company;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 2036253389338836434L;
    private int id;
    private String personName;
    private int age;
    private byte type;


    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return personName;
    }

    public void setName(String name) {
        this.personName = name;
    }

    @Override
    public String toString() {
        return id + " : " + personName;
    }
}

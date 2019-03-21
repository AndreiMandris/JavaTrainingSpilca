package io;

import java.io.Serializable;

public class Dinosaur {
    private int age;
    private String Name;

    public Dinosaur(int age, String name) {
        this.age = age;
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

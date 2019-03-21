package io;

import java.io.Serializable;

public class JurassicPark implements Serializable {
    private Dinosaur dinosaur;
    private String name;

    public JurassicPark(Dinosaur dinosaur, String name) {
        this.dinosaur = dinosaur;
        this.name = name;
    }

    public Dinosaur getDinosaur() {
        return dinosaur;
    }

    public void setDinosaur(Dinosaur dinosaur) {
        this.dinosaur = dinosaur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JurassicPark{" +
                "Park name = " + getName() +
                "name = " + dinosaur.getName() +
                "age = " + dinosaur.getAge() +
                '}';
    }
}

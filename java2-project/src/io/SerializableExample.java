package io;

import java.io.*;

public class SerializableExample {
    public static void main(String[] args) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("objects");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            Dinosaur dinosaur = new Dinosaur(73021, "Dino");
            JurassicPark jurassicPark = new JurassicPark(dinosaur, "Jurassic");
            objectOutputStream.writeObject(jurassicPark);
        } catch (IOException e){
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream("objects");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            JurassicPark jurassicPark = (JurassicPark) objectInputStream.readObject();
            System.out.println(jurassicPark);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

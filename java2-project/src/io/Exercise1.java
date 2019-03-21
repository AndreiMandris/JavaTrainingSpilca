package io;

import java.io.*;
import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr)){
            String[] instructions = br.readLine().split("\\s+");
            int numberOfRows = Integer.parseInt(instructions[0]);
            String filePath = instructions[1];
            try (PrintWriter pw = new PrintWriter(filePath)){
                Random random = new Random();
                for (int i = 0; i < numberOfRows; i++){
                    pw.println(random.nextInt(100));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

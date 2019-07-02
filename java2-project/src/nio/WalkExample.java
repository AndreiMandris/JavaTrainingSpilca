package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WalkExample {
    public static void main(String[] args) {
        Path path = Paths.get("sample.txt");
        try {
            Files.walk(path).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

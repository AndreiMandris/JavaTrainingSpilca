package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileList {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        try {
            Files.lines(path).forEach(System.out::println); // once the elements of the stream are not needed anymore they are released from the memory this way avoiding a memory leak
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

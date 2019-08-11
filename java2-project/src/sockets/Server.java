package sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("Trying to open 4444 port.");
        ServerSocket serverSocket = new ServerSocket(4444);
        System.out.println("The port has been opened.");
        Socket socket = serverSocket.accept();
        System.out.println("The client has connected.");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        int sum = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("The sum is: " + sum);
        printWriter.println(sum);
        serverSocket.close();
        System.out.println("The server has been closed.");
    }
}

package client;

import java.io.*;
import java.net.*;

public class ChatClient {
    private String serverAddress;
    private int serverPort;
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public ChatClient(String serverAddress, int serverPort) {
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
    }

    public void start() throws IOException {
        connectToServer();
        listenForMessages();
    }

    private void connectToServer() throws IOException {
        socket = new Socket(serverAddress, serverPort);
        out = new PrintWriter(socket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println("Connected to chat server at " + serverAddress + ":" + serverPort);
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    private void listenForMessages() {
        new Thread(() -> {
            String message;
            try {
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                }
            } catch (IOException e) {
                System.err.println("Error listening for messages: " + e.getMessage());
            }
        }).start();
    }

    public void close() throws IOException {
        in.close();
        out.close();
        socket.close();
    }
}
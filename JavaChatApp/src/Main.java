import client.ChatClient;
import server.ChatServer;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length > 0 && args[0].equalsIgnoreCase("server")) {
            // Start the server by calling its main method
            String[] serverArgs = {};
            ChatServer.main(serverArgs);
        } else {
            // Start the client with default address and port
            ChatClient client = new ChatClient("localhost", 12345);
            client.start();
        }
    }
}
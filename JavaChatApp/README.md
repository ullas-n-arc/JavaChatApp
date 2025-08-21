# Java Chat Application

## Overview
This project is a simple chat application built using Java socket programming. It consists of a client and a server that communicate over a network, allowing multiple clients to send and receive messages in real-time.

## Project Structure
```
JavaChatApp
├── src
│   ├── client
│   │   └── ChatClient.java
│   ├── server
│   │   └── ChatServer.java
│   └── Main.java
└── README.md
```

## Features
- **Chat Client**: Connects to the chat server, sends messages, and listens for incoming messages from other clients.
- **Chat Server**: Manages client connections and broadcasts messages to all connected clients.
- **Main Application**: Entry point that initializes either the server or client based on user input.

## Setup Instructions
1. Clone the repository or download the project files.
2. Navigate to the project directory.
3. Compile the Java files:
   ```
   javac src/Main.java src/client/ChatClient.java src/server/ChatServer.java
   ```
4. Run the server:
   ```
   java -cp src server.ChatServer
   ```
5. In a new terminal, run the client:
   ```
   java -cp src client.ChatClient
   ```

## Usage Guidelines
- Start the server first before launching any clients.
- Each client can send messages to the server, which will then broadcast them to all connected clients.
- Ensure that the server is running on the correct port and that clients are configured to connect to the right address.

## License
This project is open-source and available for modification and distribution under the MIT License.
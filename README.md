# Java Chat Application

## Overview
This is a simple terminal-based chat application built using Java socket programming. It consists of a client and a server that communicate over a network, allowing multiple clients to send and receive messages in real-time.

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
- **Multi-Client Support**: The server can handle multiple concurrent client connections
- **Real-time Messaging**: All connected clients receive messages instantly
- **Simple Terminal Interface**: Easy-to-use command-line interface
- **Clean Exit**: Clients can exit by typing `/quit`

## Technical Implementation
- Uses Java Socket Programming for network communication
- Multi-threaded server to handle multiple client connections
- Thread-safe broadcasting using synchronized collections
- Proper exception handling and resource management

## Setup Instructions

### Compilation
Navigate to the `src` directory and compile all Java files:
```
cd JavaChatApp/src
javac Main.java client/ChatClient.java server/ChatServer.java
```

### Running the Application

1. **Start the Server**:
   ```
   java Main server
   ```

2. **Start a Client** (in a new terminal):
   ```
   java Main
   ```
   You can start multiple clients by opening additional terminals and running the same command.

## Usage Guide
1. Start the server first before launching any clients
2. Launch one or more client instances
3. Type messages in any client terminal to broadcast them to all connected clients
4. Type `/quit` in a client terminal to disconnect that client
5. Use Ctrl+C in the server terminal to shut down the server

## Network Configuration
- The server runs on port 8080 by default
- Clients connect to `localhost` by default
- To connect to a remote server, modify the `serverAddress` parameter in `Main.java`

## License
This project is open-source and available for educational purposes.
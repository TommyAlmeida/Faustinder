package org.academiadecodigo.hackatonfundao.faustinder.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    
    private ServerSocket serverSocket;
    
    public Server(int port) throws IOException {
        this.serverSocket = new ServerSocket(port);
    }

    public void start() throws IOException {

        ExecutorService service = Executors.newCachedThreadPool();

        while(true){
            Socket clientSocket= serverSocket.accept();

            ClientHandler  handler = new  ClientHandler (clientSocket);
            service.submit(handler);
            System.out.println("Connection!!!");
        }

    }

    class ClientHandler implements Runnable{

        private Socket connection;

        public ClientHandler(Socket clientSocket) {
            this.connection = clientSocket;
        }

        @Override
        public void run() {

        }
    }
}

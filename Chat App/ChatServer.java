import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("💻 Server started. Waiting for client...");

            Socket socket = serverSocket.accept();
            System.out.println("✅ Client connected!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while (true) {
                // Receive message
                message = input.readLine();
                if (message == null || message.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }
                System.out.println("Client: " + message);

                // Send reply
                System.out.print("You: ");
                String reply = console.readLine();
                output.println(reply);
            }

            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

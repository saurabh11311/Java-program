import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 1234);
            System.out.println("✅ Connected to Server!");

            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            String message;
            while (true) {
                // Send message
                System.out.print("You: ");
                message = console.readLine();
                output.println(message);

                if (message.equalsIgnoreCase("exit")) {
                    System.out.println("👋 Disconnected from server.");
                    break;
                }

                // Receive reply
                String reply = input.readLine();
                System.out.println("Server: " + reply);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

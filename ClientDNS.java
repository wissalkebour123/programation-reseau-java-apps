import java.io.*;
import java.net.*;

public class ClientDNS {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 5050)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter domain name: ");
            String domain = userInput.readLine();

            out.println(domain);
            String response = in.readLine();

            System.out.println("Server response: " + response);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

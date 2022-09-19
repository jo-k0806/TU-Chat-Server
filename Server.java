import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int portNumber = 6000;
        try{
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println("Joined port: " + portNumber);
        } catch (IOException e){
            System.err.println("Could not listen on port: " + portNumber);
            System.exit(1);
        }
    }
}

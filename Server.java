import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("Enter a name: ");
        Scanner scanner=new Scanner(System.in);
        String user = scanner.next();

        int portNumber = 6000;
        try{
            ServerSocket serverSocket = new ServerSocket(portNumber);
            System.out.println(user + " joined port: " + portNumber);
        } catch (IOException e){
            System.err.println(user + " could not listen on port: " + portNumber);
            System.exit(1);
        }
    }
}

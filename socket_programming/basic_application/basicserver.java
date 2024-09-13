import java.io.IOException;
import java.net.*;
import java.util.*;
public class basicserver
{
    public static void main(String[] args) throws IOException {
        //Creating a server

       ServerSocket socket=new ServerSocket(1904);
       System.out.println("Server is started Waiting for client to connect");
        


       Socket clientsocket=socket.accept();
        try (Scanner scanner = new Scanner(clientsocket.getInputStream())) {
            String message=scanner.nextLine();

            System.out.println("The client texted : "+message);
        }
        
        socket.close();
       clientsocket.close();
       System.out.println("Client is connected"); 
    }
}
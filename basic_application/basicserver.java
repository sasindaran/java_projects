import java.io.IOException;
import java.net.*;

public class basicserver
{
    public static void main(String[] args) throws IOException {
        //Creating a server

       ServerSocket socket=new ServerSocket(1904);
       System.out.println("Server is started Waiting for client to connect");
        


       Socket clientsocket=socket.accept();
       socket.close();
       clientsocket.close();
       System.out.println("Client is connected"); 
    }
}
import java.io.*;
import java.net.*;
import java.util.*;
public class basicserver
{
    public static void main(String[] args) throws IOException {
        //Creating a server

       ServerSocket socket=new ServerSocket(1904);
       System.out.println("Server is started Waiting for client to connect");
        


       Socket clientsocket=socket.accept();
       Scanner scanner = new Scanner(clientsocket.getInputStream());       
       Scanner send = new Scanner(System.in);       
       OutputStream OutputStream=clientsocket.getOutputStream();
        while(true)
        {
            if(scanner.hasNextLine())
            {
                String message=scanner.nextLine();
                System.out.println("client says : "+message);
                if(message.equals("bye"))
                {
                    System.out.println("Termination the section");
                    break;
                }

                System.out.print("Enter a Message to send to client : ");
                
                String outputmessage=send.nextLine();
                OutputStream.write((outputmessage+"\n").getBytes());
                OutputStream.flush();
                System.out.println("Message sent Waiting for reply");
                if(outputmessage.equals("bye"))
                {
                    break;
                }
            }
        }
        socket.close();
       clientsocket.close();
       System.out.println("Client is connected"); 
    }
}
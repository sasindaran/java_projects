import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;
public class basiclient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket client=new Socket("127.0.0.1",1904);
        System.out.println("connection is established");

        Scanner scanner=new Scanner(client.getInputStream());
        OutputStream OutputStream=client.getOutputStream();
        Scanner input=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a message to send");
            String message=input.nextLine();
            OutputStream.write((message+"\n").getBytes());
            OutputStream.flush();
            System.out.println("Message sent Waiting for reply");
            if(message.equals("bye"))
            {
                break;
            }

            if(scanner.hasNextLine())
            {
                String incomingString=scanner.nextLine();
                System.out.print("Server says : "+incomingString);
                if(incomingString.equals("bye"))
                {
                    break;
                }
            }
            
        }
        //outputStream.write((message + "\n").getBytes()) converts the message into a byte array and sends it to the server. The \n ensures that the message is recognized as a complete line (similar to hitting Enter).
        client.close();
    }
}

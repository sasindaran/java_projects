import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;
public class basiclient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket client=new Socket("127.0.0.1",1904);
        System.out.println("connection is established");

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a meassage to send");
        String message=scanner.nextLine();

        OutputStream OutputStream=client.getOutputStream();
        OutputStream.write((message+"\n").getBytes());
        //outputStream.write((message + "\n").getBytes()) converts the message into a byte array and sends it to the server. The \n ensures that the message is recognized as a complete line (similar to hitting Enter).
        OutputStream.flush();
        client.close();
    }
}

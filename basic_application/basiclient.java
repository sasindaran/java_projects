import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
public class basiclient {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket client=new Socket("127.0.0.1",1904);
        System.out.println("connection is established");
        client.close();
    }
}

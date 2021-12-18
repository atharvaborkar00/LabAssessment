import java.net.*;
import java.io.*;

public class Client{
    public static void main(String[] args) throws IOException{
        Socket s = new Socket("localhost", 4999);

        PrintStream pr = new PrintStream(s.getOutputStream());
        pr.println("Is it working?");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader br = new BufferedReader(in);

        String str = br.readLine();
        System.out.println("Server: " + str);
    }
}
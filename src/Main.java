import java.io.OutputStream;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket svs = new ServerSocket(2525);
            System.out.println("wait client");
            Socket s = svs.accept();
            System.out.println("client connect");

            OutputStream out = s.getOutputStream();
            String str = "Honor shows the man.";
            System.out.println(".........");
            out.write(str.getBytes());
            out.close();
            s.close();
            System.out.println("end");


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

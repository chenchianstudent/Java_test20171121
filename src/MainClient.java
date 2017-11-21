import java.io.InputStream;
import java.net.Socket;

public class MainClient {
    public static void main(String[] args) {
        byte buff[] = new byte[1024];
        System.out.println("poi");
        try {
            System.out.println("try connect..");
            Socket s=new Socket("10.51.3.160",2525);
            System.out.println("connect now");
            InputStream in=s.getInputStream();
            int n=in.read(buff);
            System.out.print("Server:");
            System.out.println(new String(buff,0,n));
            in.close();
            s.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

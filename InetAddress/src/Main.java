import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        InetAddress inetAddress = InetAddress.getByName("www.youtube.com");
        String ipAddress = inetAddress.getHostAddress();
        System.out.println("IP address: " + ipAddress);

        String hostName = inetAddress.getHostName();
        System.out.println("Host name: " + hostName);

        boolean reachable = inetAddress.isReachable(5000);
        System.out.println("Reachable " + reachable);
        }
    }

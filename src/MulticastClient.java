import java.io.*;
import java.net.*;

public class MulticastClient {
    public static void main(String[] args) {
        throws Exception{

            //default portnumber
            int portNumber = 1235;
            if(args.length >= 1){
                portNumber = Integer.parseInt(args[0]);
            }
            //Create multicast socket
            MulticastSocket chatMulticastSocket = new MulticastSocket(portNumber);

            //Determine IP address
            InetAddress group = InetAddress.getByName("225.4.5.6");

            //Join multicast group
        }
    }

}

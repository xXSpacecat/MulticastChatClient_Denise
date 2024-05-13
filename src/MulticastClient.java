import java.io.*;
import java.net.*;

public class MulticastClient {
    public static void main(String[] args) throws Exception{

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
            chatMulticastSocket.joinGroup(group);

            //User enters message
            String msg = " ";
            System.out.println("Type message to server: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            msg = br.readLine();

            //send message to Multicast
             DatagramPacket data = new DatagramPacket(msg.getBytes(), 0, msg.length(), group, portNumber);
             chatMulticastSocket.send(data);

             //close socket
            chatMulticastSocket.close();
        }
    }



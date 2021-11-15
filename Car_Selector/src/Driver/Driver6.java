package Driver;

import java.io.*;
import client.DefaultSocketClient;
import java.net.*;
import server.*;
import client.*;
public class Driver6 {
	public static void main(String [] args) {
		DefaultSocketClient kbb = null;
		DefaultServerSocket socket = new DefaultServerSocket(4444);
		kbb = new DefaultSocketClient("192.168.1.90", 4444);
		//socket.run();
		kbb.run();
	}
}

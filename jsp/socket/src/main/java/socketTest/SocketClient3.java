package socketTest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient3 {

	public static void main(String[] args) {

		Socket soc;
		
		try {
			soc = new Socket("localhost", 8090);
			System.out.println("connect");
			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println("Hello");
			
			soc.close();
			out.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

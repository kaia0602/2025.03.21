package socketTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClient3 {
	
	Socket socket;
	BufferedReader keyReader;
	BufferedWriter bw;
	BufferedReader socketReader;
	
	
	public void initServer() {
			try {
			socket = new Socket("localhost", 7080);
			System.out.println("connect");
			
			// to server
			keyReader = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			System.out.println(">>> ");
			
			String input = keyReader.readLine();
			bw.write(input);
			bw.newLine();
			bw.flush();
			
			// from server
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String line;
			while ((line = socketReader.readLine()) != null) {
				System.out.println("수신 메시지: "+ line);
			}
			
			// socket.close();
			// bw.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ChatClient3();
	
	}
	
	public ChatClient3( ) {
		initServer();
	}
	

}

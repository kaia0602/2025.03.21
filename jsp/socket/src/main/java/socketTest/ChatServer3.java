package socketTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer3 {

	ServerSocket server;
	Socket client;
	BufferedReader br;
	BufferedReader keyReader;
	BufferedWriter bw;
	
	public void initServer() {
		try {
			server = new ServerSocket(7080); // 소켓서버
			client = server.accept(); // 소켓서버에서 accept -> client와 연결
			System.out.println("socket connect");
			
			// 클라이언트 소켓에서 온 데이터를 스트림형태로 변환
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			// 서버에서 소켓(클라이언트)으로 데이터 형태로 내보냄
			bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
			String line;
		// 	while ((line = br.readLine()) != null) {
		//		System.out.println("수신 메시지: "+ line);
			// }
			System.out.println(line = br.readLine());
			// 시스템에서 나오는 데이터를 스트림 형태로 변환
			System.out.println("keyReader Start");
			keyReader = new BufferedReader(new InputStreamReader(System.in));
			
			String serverMsg = "server: " + keyReader.readLine();
			bw.write(serverMsg);
			bw.newLine();
			bw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ChatServer3();
	}
	

	public ChatServer3() {
		initServer();
	}

}

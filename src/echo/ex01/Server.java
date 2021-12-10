package echo.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket ServerSocket = new ServerSocket();
		ServerSocket.bind(new InetSocketAddress("192.168.1.24", 10001));
		
		System.out.println("서버 시작합니다");
		
//		소켓을 이용해서 접속해보자
		Socket Socket = ServerSocket.accept();
		
		System.out.println("클라가 연결되었습니다");
		
		
//		메시지받기 스트림
		InputStream is = Socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
//		메시지받기 
		
		
//		메시지 받기- 서버단에서는 클라이언트의 문자열을 input 하는 개념
		String msg = br.readLine();
		System.out.println("받은 메시지 :" + msg);
		
		
		
		Socket.close();
		ServerSocket.close();
	}

}

package echo.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {

		ServerSocket ServerSocket = new ServerSocket();
		
//		집에서 쓴 ip
//		ServerSocket.bind(new InetSocketAddress("192.168.1.24", 10001));
		
//		학원 ip
		ServerSocket.bind(new InetSocketAddress("192.168.0.14", 10001));
		
		System.out.println("서버 시작합니다");
		
//		소켓을 이용해서 접속해보자
		Socket Socket = ServerSocket.accept();
		
		System.out.println("클라가 연결되었습니다");
		
		
//		메시지받기 스트림
		InputStream is = Socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

//		메시지 보내기 스트림
		OutputStream os = Socket.getOutputStream();
		OutputStreamWriter isw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(isw);
		
		
		while (true) {
//		메시지 받기- 서버단에서는 클라이언트의 문자열을 input 하는 개념
			String msg = br.readLine();
			
			if (msg == null) {
				System.out.println("클라 종료키 /q 입력");
				break;
			}
			System.out.println("받은 메시지 :" + msg);
			
//			메시지보내기
			bw.write(msg);
			bw.newLine();
			bw.flush();
			
		}
		
		
		
		
		
		
		
		
	}

}

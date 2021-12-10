package echo.ex01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket();
		
		System.out.println("클라이언트 시작");
		
		System.out.println("서버연결 요청");
		socket.connect(new InetSocketAddress("192.168.1.24", 10001));
		
		System.out.println("연결되었습니다");
		
		
//		메시지 보내기 스트림
		OutputStream os = socket.getOutputStream(); //주스트림
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
//		메시지 보내기
//		C:\javaStudy\workspace\chapter06\bin
//		java echo.ex01.Client
		
		String str = "안녕하니?";
		bw.write(str);
		bw.newLine();
		bw.flush(); //null 에러메시지가 나오면 비우기
		
		
		bw.close();
		socket.close();
		
	}

}

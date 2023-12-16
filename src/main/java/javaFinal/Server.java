package javaFinal;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

	//자바 기말 대비 코드
	public static void main(String[] args){
		try {
			//소켓을 위해서 try-catch로 구현

			ServerSocket s = new ServerSocket(8001);

			Socket incoming = s.accept();
			//서버 소켓에서 새로운 클라이언트 요청이 들어오면 incoming으로 해당 클라이언트
			//전용 소켓을 만들어낸다.

			InetAddress clientAddress = incoming.getInetAddress();
			//통신 방식 Inet을 사용하는(유닉스 통신과 inet통신이 있음) 클라이언트 주소 넘김


		}
		catch (IOException e){ //소켓 오류 catch 해서 처리
			e.printStackTrace();
		}
	}
}

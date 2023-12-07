package hw14;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

	public static void main(String[] args){
		try {
			ServerSocket s = new ServerSocket(8001);

			Socket incoming = s.accept();

			InetAddress clientAddress = incoming.getInetAddress();
			System.out.printf("Request from %s[%s] has been accepted\n",
					clientAddress.getHostName(), clientAddress.getHostAddress());

			try {
				InputStream inStream = incoming.getInputStream();
				OutputStream outStream = incoming.getOutputStream();

				Scanner in = new Scanner(inStream);
				PrintWriter out = new PrintWriter(outStream, true );

				out.println("Hello! Enter BYE to exit.");

				boolean done = false;
				while ( !done && in.hasNextLine()) {
					String line = in.nextLine();
					out.println("Echo: " + line);
					if (line.trim().equals("BYE")){
						done = true;
					}
				}
			}
			finally {
				incoming.close();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}

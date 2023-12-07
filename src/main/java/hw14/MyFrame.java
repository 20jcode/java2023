package hw14;

import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.util.Scanner;

public class MyFrame extends JFrame {

	private Socket socket;
	private JTextField text;

	public MyFrame(){
		setTitle("Echo Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);

		//텍스트 창 생성
		JTextArea textArea = new JTextArea(100,100);

		//버튼 생성
		JButton connectBtn = new JButton("connect");
		JButton disconnectBtn = new JButton("disconnect");

		text = new JTextField(10);

		JButton sendBtn = new JButton("send");
		JButton clearBtn = new JButton("clear");
		JButton quitBtn = new JButton("quit");

		connectBtn.addActionListener(e-> {
			try {
				connect();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		disconnectBtn.addActionListener(e->{
			try {
				disconnect();
			} catch (IOException ex){
				throw new RuntimeException(ex);
			}
		});
		sendBtn.addActionListener(e->{
			try{
				String msg = text.getText();
				send(msg);
			} catch (IOException ex){
				throw new RuntimeException(ex);
			}
		});



		quitBtn.addActionListener(e->{
			System.exit(0);
		});




		//패널 추가
		JPanel panel = new JPanel();
		panel.add(connectBtn);
		panel.add(disconnectBtn);
		panel.add(text);
		panel.add(sendBtn);
		panel.add(clearBtn);
		panel.add(quitBtn);
		add(textArea,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);

		setVisible(true);
	}

	public void connect() throws IOException{
		socket = new Socket("localhost",8001);
		System.out.println("연결됨");

	}

	public void disconnect() throws IOException{

		if(socket.isBound()){
			socket.close();
		}
		System.out.println("해제됨");
	}

	public void send(String msg) throws IOException{
		if(socket.isBound()){
			InputStream inputStream = socket.getInputStream();
			OutputStream outputStream = socket.getOutputStream();
			text.setText(msg);
			outputStream.write(msg.getBytes());

			Scanner in = new Scanner(inputStream);
			while(in.hasNextLine()){
				String line = in.nextLine();
				text.setText(line);
			}

		}
	}
}

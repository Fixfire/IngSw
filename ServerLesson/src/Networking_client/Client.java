package Networking_client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Client {
	static int num=0;
	
	public Client() throws UnknownHostException, IOException{
		Socket socket = new Socket("127.0.0.1",4567);
		num++;
		
		Scanner in = new Scanner(socket.getInputStream());
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		
//		String line = in.nextLine();
//		System.out.println("Server: "+line);
		
		out.println("Eccomi pronto! Socket: "+num);
		
		out.flush();
		
		in.close();
		out.close();
		socket.close();
	}
	
}

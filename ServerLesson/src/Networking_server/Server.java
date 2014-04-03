package Networking_server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Server {
	
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(4567);
		
		System.out.println("Avvio server...");
		Socket[] socket = new Socket[3];
		Scanner[] in = new Scanner[3];
//		PrintWriter[] out = new PrintWriter[3];
		int i;
		
		for(i=0;i<3;i++){
			
			socket[i] = serverSocket.accept();
//			out[i] = new PrintWriter(socket[i].getOutputStream());
//			out[i].println("Connection accepted");
		}
		
		for(i=0;i<3;i++){
			in[i] = new Scanner(socket[i].getInputStream());
		}
		
		for(i=0;i<3;i++){
			String line = in[i].nextLine();
			System.out.println(line);
			in[i].close();
//			out[i].close();
		}
		
		for(i=0;i<3;i++){
			socket[i].close();
		}
		
		serverSocket.close();
	}
}

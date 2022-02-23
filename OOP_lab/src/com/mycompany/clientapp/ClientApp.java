package com.mycompany.clientapp;

import java.io.*;
import java.net.Socket;

public class ClientApp {
	public static void main(String[] args) {
		Socket ss = null;
		try {
			ss = new Socket("localhost", 5555);
			System.out.println("Client: Connection Extablished");

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));
			
				bw.write("Hello:");
				Thread.sleep(200);
				
				bw.flush();
		
			bw.close();
			if (!ss.isClosed())
				ss.close();
		} catch (IOException | InterruptedException e) {
		}
	}
}

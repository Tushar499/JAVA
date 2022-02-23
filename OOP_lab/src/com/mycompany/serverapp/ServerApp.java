package com.mycompany.serverapp;

import java.io.*;
import java.net.*;

public class ServerApp {
	public static void main(String[] args) throws InterruptedException {
		ServerSocket s = null;
		Socket ss = null;
		try {
			s = new ServerSocket(5555);
			ss = s.accept();
			System.out.println("Connection Extablished");
			BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
			String inp = br.readLine();
			while (inp != null && !inp.equals("exit")) {
				System.out.println("Read:" + inp);
				inp = br.readLine();
			}
			System.out.println("Read:" + inp);
			br.close();
			if (!ss.isClosed())
				ss.close();
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));
			
			bw.write("What's your Name?");
			Thread.sleep(600);
			
			bw.flush();
	
		bw.close();
		if (!ss.isClosed())
			ss.close();
		} catch (IOException e) {
		}
	}
}
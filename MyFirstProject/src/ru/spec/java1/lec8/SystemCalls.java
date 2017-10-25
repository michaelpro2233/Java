package ru.spec.java1.lec8;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class SystemCalls {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("start");
		Process proc = Runtime.getRuntime().exec("cmd.exe");
//		proc.waitFor();
		InputStream is = proc.getInputStream();
		new Thread(()->read(is)).start();
		
		write(proc);
		
		
		System.out.println("end");
		
		
	}

	private static void write(Process proc) throws IOException, UnsupportedEncodingException {
		Scanner scanner = new Scanner(System.in);
		for(;scanner.hasNextLine();) {
			String line = scanner.nextLine();
			OutputStream os = proc.getOutputStream();
			os.write((line+ "\r\n").getBytes("cp866"));
			os.flush();
		}
	}

	private static void read(InputStream is) {
		Scanner scanner = new Scanner(is, "cp866");
		for (;scanner.hasNextLine();) {
			System.out.println(scanner.nextLine());
		}
	}

}

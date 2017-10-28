package application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

public class Server {

	static Logger log = Logger.getGlobal();
	static int count;
	static final String root = "C:/java_projects";
	static String httpOk = "HTTP/1.1 200 OK\r\n";
	static String contentType = "Content Type: text/html; charset=utf-8\r\n";
	static String length = "Content-Length: ";

	public static void main(String[] args) throws IOException {
		
		
		
		ServerSocket ss = new ServerSocket(80);
		for (;;) {
			Socket socket = ss.accept();
			try{
				doGet(socket);
			} catch (Exception e) {
				log.throwing("Server", "main", e);
				log.info(e.getMessage());
			}
		}
		// System.out.println("server is shutdown");
	}

	private static void doGet(Socket socket) throws IOException, FileNotFoundException {
		InputStream is = socket.getInputStream();
		Scanner scanner = new Scanner(is);
		String line = scanner.nextLine();
		String url = line.split("\\s+")[1];
		String path = root + url;
		for (; scanner.hasNextLine();) {
			line = scanner.nextLine();
			System.out.println(line);
			if (line.trim().isEmpty()) {
				break;
			}
		}

		OutputStream os = socket.getOutputStream();
		String content = "<html><body><h1>Hello " + (count++) + "</h1></body></html>";

		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		int fileSize = fis.available();
		byte[] bs = new byte[fileSize];
		fis.read(bs);

		os.write((httpOk + contentType + length + fileSize + "\r\n\r\n").getBytes());
		os.write(bs);
		os.close();
	}
}
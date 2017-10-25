package ru.spec.java1.lec6;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class ObjectToFile implements Serializable{

	private static final long serialVersionUID = 6439967352727685215L;
	int i = 15;
	transient String name; // transient - no serializable
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("C:/Users/mikhail.rakitskij/Documents/Java/obj.bin");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(new Date());
		
		byte[] byteArray = baos.toByteArray();
		
		System.out.println(byteArray.length);
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Date d = (Date) ois.readObject();
		System.out.println(d.getClass().getName());
		System.out.println(d);
		
		
		oos.flush();
		oos.close();
//		
		
//		ByteArrayInputStream bais = new ByteArrayInputStream(buf)
		
//		baos
	}
}

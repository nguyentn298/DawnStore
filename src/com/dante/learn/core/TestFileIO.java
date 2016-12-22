package com.dante.learn.core;

import java.io.*;

public class TestFileIO {
	
	public static void main(String[] args) {
		// save
//		writeFile();
		
		// read
		readFile();
	}
	

	/*
	 *	Using fin.close() or fout.close() to void memory leak or multi access to 1 file
	 *	example process A, B, C, D, E, F are working same file
	 */

	public static void writeFile() {
		File file = new File("D:/test.txt");
		String content = "My first string\nMy second String\nMy third String\n";
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(file);

			/*
			 *	Converting string into byte array 
			 */

			byte b[] = content.getBytes();
			fout.write(b);

			/*		if data is object
			 *	User user = new User();
			 *	ObjectOutputStream out = new ObjectOutputStream(fout);
				out.writeObject(user);
				fout.close();
			*/

			System.out.println("Wrote successful!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fout != null)
					fout.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void readFile() {
		File file = new File("D:/test.txt");
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(file);
			System.out.println("Total file size to read (in bytes) : " + fin.available());
			System.out.println();
			int i = 0;
			while((i = fin.read()) != -1) {
				System.out.print((char)i);
			}

			/*		if data is object
			 *	User user = new User();
			 *	ObjectInputStream in = new ObjectInputStream(fin);
				user = in.readObject();
				in.close();
			*/

			System.out.println();
			System.out.println("Read successful!!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
	}

	/*
	 *	An updated JDK7 example, using new “try resource close” method to handle file easily.
	 *	auto close, no need fin.close() or fout.close()
	 */

//	try (FileInputStream fis = new FileInputStream(file)) {
//		
//	}catch{
//		
//	}
}

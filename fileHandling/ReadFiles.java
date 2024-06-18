package fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {
	public static void main(String[] args) throws IOException {
		new ReadFiles().fileInputStream();
		new ReadFiles().scanner();
		new ReadFiles().fileReader();
		new ReadFiles().bufferedReader();
	}
	
	static File file2;
	
	public static void createFile() throws IOException {
		File file=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandling\\ReadingFiles");
		file.mkdir();
		
		file2=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandling\\ReadingFiles\\read.txt");
		file2.createNewFile();
//		file2.delete();
	}
	
	public void fileInputStream() throws IOException {;
		createFile();
		FileInputStream fis=new FileInputStream(file2);
		int ascii;
		String text=new String();
		
		while((ascii=fis.read())!=-1)
			text+=String.valueOf((char)ascii);

		System.out.println("FileInputStream :\n"+text);
		fis.close();
	}
	
	public void scanner() throws IOException {
		createFile();
		Scanner scan=new Scanner(file2);
		String text=new String();
		
		while(scan.hasNext())
			text+=scan.nextLine()+"\n";
		
		System.out.println("Scanner :\n"+text);
		scan.close();
	}
	
	public void fileReader() throws IOException {
		createFile();
		FileReader fr=new FileReader(file2);
		int asci;
		String text=new String();
		
		while((asci=fr.read())!=-1)
			text+=String.valueOf((char)asci);
		
		System.out.println("FileReader :\n"+text);
		fr.close();
	}
	
	public void bufferedReader() throws IOException {
		createFile();
		FileReader fr=new FileReader(file2);
		BufferedReader br=new BufferedReader(fr);
		String text=new String();
		
		System.out.printf("BufferedReader :\n");
		
		while((text=br.readLine())!=null)
			System.out.println(text);
		br.close();
	}
	
}
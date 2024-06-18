package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResources {
	public static void main(String[] args) throws IOException {
		new TryWithResources().readResource();
		new TryWithResources().writeResource();
	}

	static File file1;
	static File file2;

	public void readResource() throws IOException {
		file1=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\exceptions\\TryWithResourcesRead.txt");
		System.out.println(file1.createNewFile());

		int ascii;
		String text=new String();
		try(
				FileInputStream fis=new FileInputStream(file1);
				){
			while((ascii=fis.read())!=-1)
				text+=String.valueOf((char)ascii);
		}catch(FileNotFoundException  fnfe) {
			fnfe.printStackTrace();
		}finally {
			System.out.println(text);
		}
	}
	
	public void writeResource() throws IOException {
		file2=new File("E:\\\\Development\\\\Eclipse-Java\\\\YouTube-Java\\\\src\\\\exceptions\\\\TryWithResourcesWrite.txt");
		System.out.println(file2.createNewFile());
		
		String text="This is try with Resource program.\nI am writing here.";
		try(
				FileOutputStream fos=new FileOutputStream(file2);
				){
			for(char s:text.toCharArray())
				fos.write(s);
		}catch(FileNotFoundException  fnfe) {
			fnfe.printStackTrace();
		}
	}
	
}

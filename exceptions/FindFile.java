package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FindFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file=new File("C:\\Users\\Lenovo\\Downloads");
		FileInputStream fis= new FileInputStream(file);
		System.out.println(fis);
	}
}

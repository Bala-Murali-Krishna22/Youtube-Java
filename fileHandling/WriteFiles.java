package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
	public static void main(String[] args) throws IOException {
		new WriteFiles().createFile();
		new WriteFiles().fileOutputStream();
		new WriteFiles().fileWriter();
		new WriteFiles().bufferWriter();
	}

	static File file1;
	static File file2;
	static File file3;

	public void createFile() throws IOException {
		file1=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandling\\ReadingFiles\\write1.txt");
		file1.createNewFile();
		
		file2=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandling\\ReadingFiles\\write2.txt");
		file2.createNewFile();
		
		file3=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandling\\ReadingFiles\\write3.txt");
		file3.createNewFile();
	}

	public void fileOutputStream() throws IOException {
		createFile();
		FileOutputStream fos=new FileOutputStream(file1);
//		fos.write(78); //Individually takes time
		String write="This is File-output-stream";
		
		for(char i : write.toCharArray())
			fos.write(i);
		fos.close();
	}
	
	public void fileWriter() throws IOException {
		createFile();
		FileWriter fw=new FileWriter(file2);
		fw.write("This is File-writer");
		fw.close();
	}
	
	public void bufferWriter() throws IOException {
		createFile();
		FileWriter fw=new FileWriter(file3);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("This is Buffered-writer");
		bw.close();
	}
	
}

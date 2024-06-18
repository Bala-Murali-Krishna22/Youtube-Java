package fileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class CreateFile {
	public static void main(String[] args) throws IOException {
		file();
		folder();;
	}
	
	public static void file() throws IOException {
		//File'Folder path && Absolute path
		File file=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandling\\file.txt");
		
//		System.out.println(file.createNewFile()); //It ll create new folder and return true
		//If it is present it wont create and retun false
//		System.out.println(file.delete()); //It ll delete the file
//		System.out.println(file.exists()); // To know it is in or not
		
//		if(file.exists()) //1.If it is present, 2.If it is not
//			file.delete(); //1.Delete this
//		file.createNewFile(); //1,2.Create new file
		
//		System.out.println(file.isHidden());//If it is hidden returns true, or returns false
		
//		System.out.println(file.canWrite());//Cant write anything, 
//		If Read-only mode return false, Can write it shows true
		
//		System.out.println(file.setWritable(true));//It give access to write
		
		System.out.println(new Date(file.lastModified()));
	}

	public static void folder() throws IOException {
		File file=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandling\\Files\\resume.pdf"); //Relative path
		
//		System.out.println(file.mkdir()); //To create one file/folder
		System.out.println(file.mkdirs()); //To create more than one file/folder

//		System.out.println(file.getName()); //Gives the file/folder name
//		System.out.println(file.getParent()); // Gives path up to the parent class

		File file2=new File(file.getParent()+"\\resume.docx"); //Add file to Parent class
//		file2.createNewFile();
		
		System.out.println(new Date(file.lastModified()));
		System.out.println(new Date(file2.lastModified()));
		
		File file3=new File("./Files");
		System.out.println(file3.getName());
		System.out.println(file3.getPath());
		
//		file.delete();
	}
	
}
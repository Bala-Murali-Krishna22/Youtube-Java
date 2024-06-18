package fileHandlingProperties;

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
//import java.io.IOException;
import java.util.Properties;
import java.util.*;

public class Handling_properties {
	public static void main(String[] args) throws Exception {
		Handling_properties hp=new Handling_properties();
		hp.createFile();
		hp.createPropertiesFile();
		hp.createOutputSream();
		hp.keys();
		hp.values();
		hp.keyValues();
	}
//	###
	File file;
	Properties properties;
//	###1
	public void createFile() throws Exception {
		file=new File("E:\\Development\\Eclipse-Java\\YouTube-Java\\src\\fileHandlingProperties\\dbConnect");
		if(!file.exists())
			file.createNewFile();
		System.out.println("File : "+file.exists());
	}
//	###2
	public void createPropertiesFile() {
		properties=new Properties();
		properties.setProperty("url", "localHost");
//		properties.setProperty("url", "localHost1"); //For update
		properties.setProperty("username", "java"); 
		properties.setProperty("password", "java123");
		System.out.println(properties);
	}
//	###3
	public void createOutputSream() throws Exception {
		FileOutputStream fileOutputStream=new FileOutputStream(file);
		properties.store(fileOutputStream, "First db connect details");
	}
//	###4
	public void keys() {
		Set<String> key=properties.stringPropertyNames();
		System.out.print("Keys : ");
		for(String keys: key)
			System.out.print(keys+" ");
	}
//	###5
	public void values() {
		Collection<Object> value=properties.values();
		System.out.print("\nValues : ");
		for(Object values: value)
			System.out.print(values+" ");
	}
//	###6
	public void keyValues() {
		Set<Object> keyVal=properties.keySet();
		System.out.print("\nKeys and values : ");
		for(Object keyVals: keyVal)
			System.out.print(keyVals+" >>> "+properties.getProperty((String)keyVals)+", ");
	}
//	###7
}

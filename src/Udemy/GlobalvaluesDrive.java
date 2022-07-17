package Udemy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalvaluesDrive {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();
		
		//extract data from properties file
		FileInputStream fis=new FileInputStream("E:\\selenium workspace\\MyTestProject\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browse"));
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browse", "firefox");
		System.out.println(prop.getProperty("browse"));
		
		
		
		//return data to properties file
		FileOutputStream fis1=new FileOutputStream("E:\\selenium workspace\\MyTestProject\\src\\data.properties");
		
	prop.store(fis1,null);
		
		
	}

}

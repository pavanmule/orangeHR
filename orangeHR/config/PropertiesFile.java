package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import orangeHR.TestNGDemo;

public class PropertiesFile {
	static Properties pro=new Properties();

	public static void main(String[] args)  {
		getProperties();
		setProperties();
		getProperties();
	}

	public static void getProperties() 
	{
		try {

			InputStream input = new FileInputStream("D:\\pavanmulejava\\orangeHR\\config\\config.properties");
			
			pro.load(input);
			String browser=pro.getProperty("browser");
			System.out.println(browser);
			TestNGDemo.Browsername=browser;
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
	public static  void setProperties()
	{
		try {
			OutputStream output=new FileOutputStream("D:\\pavanmulejava\\orangeHR\\config\\config.properties");
			pro.setProperty("result", "pass");
			pro.store(output, null);
		}
		catch(Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}



	}









}




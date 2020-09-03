package com.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {

public static String URI;

public Configuration()
{

	
	loadProperties();
	
}






public  void loadProperties()
{	
Properties prop=new Properties();
 

try {  
	FileReader reader=new FileReader(new File("C:\\neeru\\workspace\\Rest\\src\\Resources\\config.properties"));
	//FileReader reader=new FileReader(new File(String.format("%s/config.properties",System.getProperty("user.dir"))));
	prop.load(reader);
    	
  URI=prop.getProperty("uri");
   System.out.println(URI);

// catch(FileNotFoundException e)
// {
 
// e.printStackTrace();
	 
 }catch(Exception e)
 {
	  
     e.printStackTrace();

   }
}

public static void main(String[] args)
{
	
  Configuration c=new Configuration();
    c.loadProperties();
    


}











}

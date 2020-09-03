package com.util;



	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.util.Properties;

	public class Congig {

	  public  String URI="";
	 
	  public  void readProperties()
	  {
		  Properties prop=new Properties();
		  FileReader fr;
		  
	      try
	      {
	    	  fr=new FileReader(new File("C:\\neeru\\workspace\\Rest\\src\\Resources\\config.properties"));
	           prop.load(fr);
	          
	          
	          URI=prop.getProperty("uri") ; 
	          System.out.println(URI);
	         
	      }catch(FileNotFoundException e)
	      {
	      
	       e.printStackTrace();
	      }catch(Exception e)
	      {
	  
	       e.printStackTrace();
	  
	     }
	  }



	  public static void main(String[] args)
	   {
		
	    	 Congig bc=new Congig();
	    	 
	    bc.readProperties();
	         
	   
	   }


}

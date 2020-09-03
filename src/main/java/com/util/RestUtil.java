package com.util;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.wbl.Pojo.PojoClass;

public class RestUtil {

	 HttpUriRequest request;
	 HttpResponse response;
	 
     private PojoClass usera;
     String URI=Configuration.URI;

	
  String json;
	
	
	
	
	public PojoClass getUsera() {
		return usera;
	}

	public void setUsera(PojoClass usera) {
		this.usera = usera;
	}

	
     public void getRequest(String resourceUrn)
     
     {
    	 request=new HttpGet(URI+resourceUrn);
    	 
    	 
    	 
    	 request.addHeader(HttpHeaders.CONTENT_TYPE,"application/json");
     try
    {
    	this.response= HttpClientBuilder.create().build().execute(request);
     
       
    	//json=EntityUtils.toString(response.getEntity());
    	
    //System.out.println(json);
    	
    	setUsera(ResourceUtil.retrieveResource(response, PojoClass.class));
     
     }
    catch(ClientProtocolException e)
     {
   	e.printStackTrace();
     }
    catch(IOException e)
    {
    	 
    	e.printStackTrace(); 
    	 
    } 
     }
   public int getStausCode()
   {
	   return response.getStatusLine().getStatusCode();
   }
	
     
  public String validateLogin()
  {
	  return getUsera().getLogin();
  }


/* public String headerAdd()
 {
  Header[] headerArray=response.getAllHeaders();
 HashMap<String,String> allHeaders=new HashMap<String,String>();
 
 /* for(Header header:headerArray)
  {
	  allHeaders.put(header.getName(),header.getValue());
  
  
  }

 System.out.println("Header Array..." + allHeaders);
 
 for(int i=0;i<headerArray.length;i++)
   return 
//return null;
 } */
  
  
  /* public static void main(String[] args)
  {
   RestUtil rb=new RestUtil();
   String s="users/whiteboxqa";
   rb.getRequest(s);
  }*/

  public String validateId()
  {
	  return getUsera().getId();
  }


public Header validateHeader()
{
	Header valid=response.getFirstHeader("content-type");
	return valid;
}

















}

















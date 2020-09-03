package com.wbl.Test;

import static org.testng.Assert.assertEquals;

import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.RestUtil;

public class GitHubTest extends BaseTest{

   RestUtil util;
   
   @BeforeClass
   public void beforeclass()
   {
	 util=new RestUtil();  
   }
@Test
 public void statusCode()
 {
	util.getRequest("users/whiteboxhub");
	
	assertEquals(HttpStatus.SC_OK,util.getStausCode());


 }


@Test
public void login()
{
	util.getRequest("users/whiteboxhub");
    assertEquals("WhiteboxHub",util.validateLogin());


}

@Test
public void gettingId()
{
	util.getRequest("users/whiteboxhub");
	assertEquals("4023110",util.validateId());


}

@Test
public void getHeaders()
{
	util.getRequest("users/whiteboxhub");
  assertEquals("content-type: application/json; charset=utf-8",util.validateHeader());

}





}

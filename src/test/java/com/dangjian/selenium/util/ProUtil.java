package com.dangjian.selenium.util;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ProUtil {
	  private Properties prop;
	   private String filePaht;
	   /*/
	    * 构造方法
	    */
	   public ProUtil(String filePath) {
		   this.filePaht = filePath;
		   this.prop = readProperties();
	   }
	   /*/
	    * 读取配置文件
	    */
	   private Properties readProperties() {
		   Properties properties = new Properties();
		   try {
			   InputStream iuputStream = new FileInputStream(filePaht);
			   BufferedInputStream in = new BufferedInputStream(iuputStream);
		  
		    	properties.load(in);
				
			} catch (IOException e) {
				e.printStackTrace();	
			}
		    return properties;	
		  
		   }
	   

	   public String getPro(String key) {
		    if(prop.containsKey(key)){
		    	 String username = prop.getProperty(key);
		    	 return username;
		    }else{
		    	System.out.println("你获取key值不对");
		    	return "";
		    }
	   }
	   
	   	
	   }


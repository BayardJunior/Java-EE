package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

public class Properties {
	
	private static final String FILE_NAME = "/Users/BayardJunior/Desktop/props.txt";
	private static java.util.Properties props;
	
	static {
		props = new java.util.Properties();
		try{
			props.load(new FileInputStream(FILE_NAME));
		}catch(IOException e){	
			e.printStackTrace();
		}
	}
	
	private Properties(){
	}
	
	public static Map<String, String> getProperties(){
		
		Map<String, String> map = new TreeMap<String, String>();
		Enumeration<Object> e = props.keys();
		
		while(e.hasMoreElements()){
			String key = (String) e.nextElement();
			String value = props.getProperty(key);
			map.put(key, value);
		}
		return map;
	}
	
	public static void delete(String key) throws FileNotFoundException, IOException{
		props.remove(key);
		props.store(new FileOutputStream(FILE_NAME),"");
	}
	
	public static void save(String key, String value) throws FileNotFoundException, IOException{
		props.setProperty(key, value);
		props.store(new FileOutputStream(FILE_NAME),"");
	}
	
	public static String getValue(String key){
		return props.getProperty(key);
	}

}

package net.keshen.fishgame.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 配置文件工具类
 * @author shenke
 * @date 2016-3-9 下午1:55:10
 */
public class PropertiesUtils {

	public static Map<String,String> getImageMap(){
		Map<String,String> iamgeMap = new HashMap<String, String>(); 
		Properties p = new Properties();
		try {
			InputStream in = PropertiesUtils.class.getClassLoader().getResourceAsStream("config.properties");
			p.load(in);
			String key = StringUtils.EMPTY;
			for (Object obj : p.keySet()) {
				key = (String)obj;
				if(key.contains("image")){
					String name = key.substring(key.lastIndexOf(".")+1);
					iamgeMap.put(name, p.getProperty(key));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return iamgeMap;
	}
	public static void main(String[] args) {
		getImageMap();
		
	}
}

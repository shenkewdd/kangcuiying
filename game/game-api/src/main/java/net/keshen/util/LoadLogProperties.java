package net.keshen.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import net.keshen.logger.LoggerManager;

/**
 * 加载日志的配置文件
 * @author shenke
 * @date 2016-3-29 下午3:15:12
 */
public class LoadLogProperties {

	/**
	 * 自动搜索工程下的文件，若搜索不到则使用默认的Logger
	 * @return
	 */
	public static Properties getLoggerProperties(){
		InputStream in = null;
		try {
			in = LoadLogProperties.class.getClassLoader().getResourceAsStream("logger.properties");
			Properties properties = new Properties();
			properties.load(in);
			return properties;
		} catch (Exception e) {
			if(in==null){
				System.setProperty("net.keshen.logger", "log4j");
				LoggerManager.getLogger(LoadLogProperties.class).info("使用默认的日志："+System.getProperty("net.keshen.logger"));
			}
		}finally{
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}

package net.keshen.logger;

import java.util.HashMap;
import java.util.Map;

import net.keshen.logger.log4j.Log4jLoggerAdapter;
import net.keshen.logger.support.FailsafeLogger;

/**
 * 日志输出器管理器
 * @author shenke
 * @date 2016-3-28 下午3:38:10
 */
public class LoggerManager {
	
	private volatile static LoggerAdapter LOGGER_ADAPTER;
	
	private static final Map<String,FailsafeLogger> LOGGERS = new HashMap<String, FailsafeLogger>();
	
	static{
		String key = System.getProperty("net.keshen.logger");
		if("log4j".equals(key)){
			setLoggerAdapter(new Log4jLoggerAdapter());
		}
	}
	
	private LoggerManager(){
		
	}
	
	/**
	 * 设置日志输出器提供器
	 * @param adapter
	 */
	public static void setLoggerAdapter(LoggerAdapter adapter){
		LOGGER_ADAPTER = adapter;
		LOGGERS.put(null, (FailsafeLogger) adapter);
	}
	
	/**
	 * 获取日志输出器
	 * @param clazz
	 * @return 
	 * 
	 */
	public static Logger getLogger(Class<?> clazz){
		return LOGGER_ADAPTER.getLogger(clazz);
	}
	
	/**
	 * 获取日志输出去器
	 * @param name
	 * @return
	 */
	public static Logger getLogger(String name){
		return LOGGER_ADAPTER.getLogger(name);
	}
	
}

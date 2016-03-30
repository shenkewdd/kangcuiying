package net.keshen.logger;

import java.io.File;

/**
 * 日志适配器
 * 
 * @author shenke
 * @date 2016-3-28 下午3:31:25
 */
public interface LoggerAdapter {

	/**
	 * 获取日志输出器
	 * @param clazz
	 * @return
	 */
	Logger getLogger(Class<?> clazz);
	
	/**
	 * 获取日志输出器
	 * @param name
	 * @return
	 */
	Logger getLogger(String name);
	
	/**
	 * 获取日志等级
	 * @return
	 */
	Level getLevel();
	
	/**
	 * 设置日志等级
	 * @param level
	 */
	void setLevel(Level level);
	
	/**
	 * 获取日志文件
	 * @return
	 */
	File getFile();
	
	/**
	 * 设置日志文件
	 * @param file
	 */
	void setFile(File file);
}

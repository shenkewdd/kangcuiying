package net.keshen.logger.jdk;

import java.io.File;

import net.keshen.logger.Level;
import net.keshen.logger.Logger;
import net.keshen.logger.LoggerAdapter;

/**
 * @author shenke
 * @date 2016年3月28日下午10:28:12
 * @version 1.0
 */
public class JdkLoggerAdapter implements LoggerAdapter{

	private File file;
	
	public JdkLoggerAdapter() {
		
	}
	
	
	public Logger getLogger(Class<?> clazz) {
		return null;
	}

	
	public Logger getLogger(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Level getLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setLevel(Level level) {
		// TODO Auto-generated method stub
		
	}

	
	public File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setFile(File file) {
		// TODO Auto-generated method stub
		
	}
	
	

}

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
	
	public public JdkLoggerAdapter() {
		
	}
	
	@Override
	public Logger getLogger(Class<?> clazz) {
		return null;
	}

	@Override
	public Logger getLogger(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Level getLevel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLevel(Level level) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public File getFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFile(File file) {
		// TODO Auto-generated method stub
		
	}
	
	

}

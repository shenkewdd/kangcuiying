package net.keshen.logger.sl4j;

import java.io.File;

import net.keshen.logger.Level;
import net.keshen.logger.Logger;
import net.keshen.logger.LoggerAdapter;

/**
 * @author shenke
 * @date 2016年3月28日下午9:16:55
 * @version 1.0
 */
public class Sl4jLoggerAdapter implements LoggerAdapter{

	private Level level;
	private File file;
	
	
	public Logger getLogger(Class<?> clazz) {
		return new Sl4jLogger(org.slf4j.LoggerFactory.getLogger(clazz));
	}
	
	public Logger getLogger(String name) {
		return new Sl4jLogger(org.slf4j.LoggerFactory.getLogger(name));
	}
	
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public File getFile() {
		return this.file;
	}

	public void setFile(File file) {
		this.file = file;
	}


}

package net.keshen.logger.log4j;

import java.io.File;

import net.keshen.logger.Level;
import net.keshen.logger.Logger;
import net.keshen.logger.LoggerAdapter;

/**
 * @author shenke
 * @date 2016-3-28 下午4:00:48
 */
public class Log4jLoggerAdapter implements LoggerAdapter{

	private Level level;
	private File file;
	
	public Logger getLogger(Class<?> clazz) {
		return new Log4jLogger(org.apache.log4j.LogManager.getLogger(clazz));
	}

	public Logger getLogger(String name) {
		return new Log4jLogger(org.apache.log4j.LogManager.getLogger(name));
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

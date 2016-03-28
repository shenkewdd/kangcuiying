package net.keshen.logger.log4j;

import org.apache.log4j.Level;

import net.keshen.logger.Logger;

/**
 * @author shenke
 * @date 2016-3-28 下午3:41:30
 */
public class Log4jLogger implements Logger{
	
	private org.apache.log4j.Logger logger;
	
	public Log4jLogger(org.apache.log4j.Logger logger){
		this.logger = logger;
	}
	
	
	public void trace(String message) {
		logger.trace(message);
		
	}

	
	public void trace(Throwable e) {
		logger.trace(e.getMessage(), e);
	}

	
	public void trace(String message, Throwable e) {
		logger.trace(message, e);
	}

	
	public void debug(String message) {
		logger.debug(message);
	}

	
	public void debug(Throwable e) {
		logger.debug(e.getMessage(), e);
	}

	
	public void debug(String message, Throwable e) {
		logger.debug(message, e);
	}

	
	public void info(String message) {
		logger.info(message);
	}

	
	public void info(Throwable e) {
		logger.info(e.getMessage(), e);
	}

	
	public void info(String message, Throwable e) {
		logger.info(message, e);
	}

	
	public void warn(String message) {
		logger.warn(message);
	}

	
	public void warn(Throwable e) {
		logger.warn(e.getMessage(), e);
	}

	
	public void warn(String message, Throwable e) {
		logger.warn(message, e);
	}

	
	public void error(String message) {
		logger.error(message);
	}

	
	public void error(Throwable e) {
		logger.error(e.getMessage(), e);
	}

	
	public void error(String message, Throwable e) {
		logger.error(message, e);
	}

	
	public boolean isTraceEnabled() {
		return logger.isTraceEnabled();
	}

	
	public boolean isDebugEnabled() {
		return logger.isDebugEnabled();
	}

	
	public boolean isInfoEnabled() {
		return logger.isTraceEnabled();
	}

	
	public boolean isWarnEnabled() {
		return logger.isEnabledFor(Level.WARN);
	}

	
	public boolean isErrorEnabled() {
		return logger.isEnabledFor(Level.ERROR);
	}

	
}

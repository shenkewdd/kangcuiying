package net.keshen.logger.jdk;

import java.util.logging.Level;

import net.keshen.logger.Logger;

/**
 * @author shenke
 * @date 2016年3月28日下午9:25:15
 * @version 1.0
 */
public class JdkLogger implements Logger {

	private java.util.logging.Logger logger;

	public JdkLogger(java.util.logging.Logger logger) {
		this.logger = logger;
	}

	public void trace(String message) {
		logger.log(Level.FINER, message);

	}

	public void trace(Throwable e) {
		logger.log(Level.FINER, e.getMessage(), e);
	}

	public void trace(String message, Throwable e) {
		logger.log(Level.FINER, message, e);
	}

	public void debug(String message) {
		logger.log(Level.FINE, message);
	}

	public void debug(Throwable e) {
		logger.log(Level.FINE, e.getMessage(), e);
	}

	public void debug(String message, Throwable e) {
		logger.log(Level.FINE, message, e);
	}

	public void info(String message) {
		logger.log(Level.INFO, message);
	}

	public void info(Throwable e) {
		logger.log(Level.INFO, e.getMessage(), e);
	}

	public void info(String message, Throwable e) {
		logger.log(Level.INFO, e.getMessage(), e);
	}

	public void warn(String message) {
		logger.log(Level.WARNING, message);
	}

	public void warn(Throwable e) {
		logger.log(Level.WARNING, e.getMessage(), e);
	}

	public void warn(String message, Throwable e) {
		logger.log(Level.WARNING, message, e);
	}

	public void error(String message) {
		logger.log(Level.SEVERE, message);
	}

	public void error(Throwable e) {
		logger.log(Level.SEVERE, e.getMessage(), e);
	}

	public void error(String message, Throwable e) {
		logger.log(Level.SEVERE, e.getMessage(), e);
	}

	public boolean isTraceEnabled() {
		return logger.isLoggable(Level.FINER);
	}

	public boolean isDebugEnabled() {
		return logger.isLoggable(Level.FINE);
	}

	public boolean isInfoEnabled() {
		return logger.isLoggable(Level.INFO);
	}

	public boolean isWarnEnabled() {
		return logger.isLoggable(Level.WARNING);
	}

	public boolean isErrorEnabled() {
		return logger.isLoggable(Level.SEVERE);
	}

	public void log(net.keshen.logger.Level level, String message) {
		switch (level) {
		case TRACE:
			trace(message);
			break;
		case INFO:
			info(message);
			break;
		case DEBUG:
			debug(message);
			break;
		case WARN:
			warn(message);
			break;
		case ERROR:
			error(message);
		default:
			break;
		}
	}

	public void log(net.keshen.logger.Level level, Throwable e) {

	}

	public void log(net.keshen.logger.Level level, String message, Throwable e) {
		// TODO Auto-generated method stub

	}

}

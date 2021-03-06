package net.keshen.logger.support;

import net.keshen.logger.Level;
import net.keshen.logger.Logger;

/**
 * 安全的Logger
 * 
 * @author shenke
 * @date 2016-3-28 下午4:34:13
 */
public class FailsafeLogger implements Logger {

	private Logger logger;

	public FailsafeLogger(Logger logger) {
		this.logger = logger;
	}

	public void trace(String message) {
		try {
			logger.trace(message);
		} catch (Exception e) {
		}
	}

	public void trace(Throwable e) {
		try {
			logger.trace(e);
		} catch (Exception e1) {
		}
	}

	public void trace(String message, Throwable e) {
		try {
			logger.trace(message, e);
		} catch (Exception e1) {
		}
	}

	public void debug(String message) {
		try {
			logger.debug(message);
		} catch (Exception e) {
		}
	}

	public void debug(Throwable e) {
		try {
			logger.debug(e);
		} catch (Exception e1) {
		}
	}

	public void debug(String message, Throwable e) {
		try {
			logger.debug(message, e);
		} catch (Exception e1) {
		}
	}

	public void info(String message) {
		try {
			logger.info(message);
		} catch (Exception e1) {
		}
	}

	public void info(Throwable e) {
		try {
			logger.info(e);
		} catch (Exception e1) {
		}
	}

	public void info(String message, Throwable e) {
		try {
			logger.info(message, e);
		} catch (Exception e1) {
		}
	}

	public void warn(String message) {
		try {
			logger.warn(message);
		} catch (Exception e1) {
		}
	}

	public void warn(Throwable e) {
		try {
			logger.warn(e);
		} catch (Exception e1) {
		}
	}

	public void warn(String message, Throwable e) {
		try {
			logger.warn(message, e);
		} catch (Exception e1) {
		}
	}

	public void error(String message) {
		try {
			logger.error(message);
		} catch (Exception e1) {
		}
	}

	public void error(Throwable e) {
		try {
			logger.error(e);
		} catch (Exception e1) {
		}
	}

	public void error(String message, Throwable e) {
		try {
			logger.error(message, e);
		} catch (Exception e1) {
		}
	}

	public boolean isTraceEnabled() {
		try {
			return logger.isTraceEnabled();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isDebugEnabled() {
		try {
			return logger.isDebugEnabled();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isInfoEnabled() {
		try {
			return logger.isInfoEnabled();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isWarnEnabled() {
		try {
			return logger.isWarnEnabled();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isErrorEnabled() {
		try {
			return logger.isErrorEnabled();
		} catch (Exception e) {
			return false;
		}
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
		switch (level) {
		case TRACE:
			trace(e.getMessage(), e);
			break;
		case INFO:
			info(e.getMessage(), e);
			break;
		case DEBUG:
			debug(e.getMessage(), e);
			break;
		case WARN:
			warn(e.getMessage(), e);
			break;
		case ERROR:
			error(e.getMessage(), e);
		default:
			break;
		}

	}

	public void log(net.keshen.logger.Level level, String message, Throwable e) {
		switch (level) {
		case TRACE:
			trace(message, e);
			break;
		case INFO:
			info(message, e);
			break;
		case DEBUG:
			debug(message, e);
			break;
		case WARN:
			warn(message, e);
			break;
		case ERROR:
			error(message, e);
		default:
			break;
		}

	}

}

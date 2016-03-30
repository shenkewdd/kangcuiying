package net.keshen.logger;
/**
 * 日志接口
 * @author shenke
 * @date 2016-3-28 下午3:10:21
 */
public interface Logger {

	/**
	 * 输出日志信息
	 * @param level	日志等级
	 * @param message 日志信息
	 */
	public void log(Level level,String message);
	
	/**
	 * 
	 * @param level
	 * @param e
	 */
	public void log(Level level,Throwable e);
	
	/**
	 * 
	 * @param level
	 * @param message
	 * @param e
	 */
	public void log(Level level,String message,Throwable e);
	
	/**
	 * 输出跟踪信息
	 * 
	 * @param message 日志信息
	 */
	public void trace(String message);
	
	/**
	 * 输出跟踪信息
	 * 
	 * @param e 异常信息
	 */
	public void trace(Throwable e);
	
	/**
	 * 输出跟踪信息
	 * 
	 * @param message 日志信息
	 * @param e		     异常信息	
	 */
	public void trace(String message,Throwable e);
	
	/**
	 * 输出调试信息
	 * 
	 * @param message 日志信息
	 */
	public void debug(String message);
	
	/**
	 * 输出调试信息
	 * 
	 * @param e	异常信息
	 */
	public void debug(Throwable e);
	
	/**
	 * 输出调试信息
	 * 
	 * @param message 日志信息
	 * @param e	异常信息
	 */
	public void debug(String message,Throwable e);
	
	/**
	 * 输出普通信息
	 * 
	 * @param message	日志信息
	 */
	public void info(String message);
	
	/**
	 * 输出普通信息
	 * 
	 * @param e	异常信息
	 */
	public void info(Throwable e);
	
	/**
	 * 输出普通信息
	 * 
	 * @param message 日志信息
	 * @param e	异常信息
	 */
	public void info(String message,Throwable e);
	
	/**
	 * 输出警告信息
	 * 
	 * @param message 日志信息
	 */
	public void warn(String message);
	
	/**
	 * 输出警告信息
	 * 
	 * @param e	异常信息
	 */
	public void warn(Throwable e);
	
	/**
	 * 输出警告信息
	 * @param message 日志信息
	 * @param e	异常信息
	 */
	public void warn(String message,Throwable e);
	
	/**
	 * 输出错误信息
	 * 
	 * @param message 日志信息
	 */
	public void error(String message);
	
	/**
	 * 输出错误信息
	 * 
	 * @param e	异常信息
	 */
	public void error(Throwable e);
	
	/**
	 * 输出错误信息
	 * 
	 * @param message 日志信息
	 * @param e	异常信息
	 */
	public void error(String message,Throwable e);
	
	/**
	 * 跟踪信息是否开启
	 * 
	 * @return
	 */
	public boolean isTraceEnabled();
	
	/**
	 * 调试信息是否开启
	 * @return
	 */
	public boolean isDebugEnabled();
	
	/**
	 * 普通信息是否开启
	 * @return
	 */
	public boolean isInfoEnabled();
	
	/**
	 * 警告信息是否开启
	 * 
	 * @return
	 */
	public boolean isWarnEnabled();
	
	/**
	 * 错误信息是否开启
	 * @return
	 */
	public boolean isErrorEnabled();
	
}

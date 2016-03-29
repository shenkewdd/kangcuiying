package net.keshen.logger;

import org.junit.Test;

/**
 * @author shenke
 * @date 2016-3-29 下午2:08:00
 */
public class LoggerTest {
	
	static{
		System.setProperty("net.keshen.logger", "sl4j");
	}
	
	@Test
	public void testLog4jLogger(){
		Logger logger = LoggerManager.getLogger(getClass());
		logger.info("123");
	}
	
	@Test
	public void testSl4jLogger(){
		Logger logger = LoggerManager.getLogger(getClass());
		logger.info("sl4jLogger test");
	}
}

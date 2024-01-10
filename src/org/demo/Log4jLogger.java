package org.demo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * A Wrapper class to wrap org.apache.log4j.Logger with LoggerInterface
 */
public final class Log4jLogger implements LoggerInterface{
	private Logger logger = null;
	private Log4jLogger(String name){
		this.logger = org.apache.logging.log4j.LogManager.getLogger(name);
	}

	/**
	 * org.apache.log4j.Logger#log
	 */
	public void log(int logLevel,String logMsg){
		logger.log(Level.forName(LogLevel.getName(logLevel),logLevel),logMsg);
	}

	/**
	 * org.apache.log4j.Logger#log
	 */
	public void log(int logLevel,String logMsg,Throwable t){
		logger.log(Level.forName(LogLevel.getName(logLevel),logLevel),logMsg,t);
	}
	
	/**
	 * org.apache.log4j.Logger#isEnabledFor
	 */
	public boolean isEnabledFor(int logLevel){
		return logger.isEnabled(Level.forName(LogLevel.getName(logLevel),logLevel));
	}

	public boolean isTraceEnabled(){
		return logger.isTraceEnabled();
	}
	public void trace(String msg){
		logger.trace(msg);
	}
	public void trace(String msg,Throwable t){
		logger.trace(msg,t);
	}

	public boolean isDebugEnabled(){
		return logger.isDebugEnabled();
	}
	public void debug(String msg){
		logger.debug(msg);
	}
	public void debug(String msg,Throwable t){
		logger.debug(msg,t);
	}

	public boolean isInfoEnabled(){
		return logger.isInfoEnabled();
	}
	public void info(String msg){
		logger.info(msg);
	}
	public void info(String msg,Throwable t){
		logger.info(msg,t);
	}

	public void warn(String msg){
		logger.warn(msg);
	}
	public void warn(String msg,Throwable t){
		logger.warn(msg,t);
	}

	public void error(String msg){
		logger.error(msg);
	}
	public void error(String msg,Throwable t){
		logger.error(msg,t);
	}

	public void fatal(String msg){
		logger.fatal(msg);
	}
	public void fatal(String msg,Throwable t){
		logger.fatal(msg,t);
	}

	/**
	 * org.apache.log4j.Logger#getLogger
	 */
	public static Log4jLogger getLogger(String name){
		// since Log4j already give the same logger for same name, here we have no need to do pooling ourself
		return new Log4jLogger(name);
	}

	/**
	 * org.apache.log4j.Logger#getLogger
	 */
	public static Log4jLogger getLogger(Class clazz){
		return new Log4jLogger(clazz.getName());
	}


}

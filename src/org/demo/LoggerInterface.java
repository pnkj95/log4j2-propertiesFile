package org.demo;

/**
 *  Simplest Logger Interface Definition
 */
public interface LoggerInterface{
	void log(int logLevel,String logMsg);
	void log(int logLevel,String logMsg,Throwable t);
	boolean isEnabledFor(int logLevel);
}

package org.demo;

/**
 * <p>Static Declaration for LogLevel.</p>
 */
public final class LogLevel{
	private LogLevel(){
	}
	/**
	 * Follow the constant value of org.apache.log4j.Priority
	 **/
	public static final int FATAL = 50000;
	/**
	 * Follow the constant value of org.apache.log4j.Priority
	 **/
	public static final int ERROR = 40000;
	/**
	 * Follow the constant value of org.apache.log4j.Priority
	 **/
	public static final int WARN  = 30000;
	/**
	 * Follow the constant value of org.apache.log4j.Priority
	 **/
	public static final int INFO  = 20000;
	/**
	 * Follow the constant value of org.apache.log4j.Priority
	 **/
	public static final int DEBUG = 10000;

	/**
	 * Follow the constant value of org.apache.log4j.Priority;
	 */
	public static final int TRACE = 0;

	/**
	 * Convert a String to LogLevel
	 */
	public static int getLevel(String in){
		if(in==null || in.length() == 0){
			return 0;
		}else if(in.equalsIgnoreCase("FATAL")){
			return FATAL;
		}else if(in.equalsIgnoreCase("ERROR")){
			return ERROR;
		}else if(in.equalsIgnoreCase("WARN")){
			return WARN;
		}else if(in.equalsIgnoreCase("INFO")){
			return INFO;
		}else if(in.equalsIgnoreCase("DEBUG")){
			return DEBUG;
		}else{
			return 0;
		}
	}
	
	public static String getName(int in){
		if(in==0){
			return "TRACE";
		}else if(in==50000){
			return "FATAL";
		}else if(in==40000){
			return "ERROR";
		}else if(in==30000){
			return "WARN";
		}else if(in==20000){
			return "INFO";
		}else if(in==10000){
			return "DEBUG";
		}else{
			return "TRACE";
		}
	}
}

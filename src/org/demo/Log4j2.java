package org.demo;

import java.io.File;
import java.io.FileInputStream;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.xml.XmlConfiguration;
import org.test.Test;

public class Log4j2 {
	
    private static final Logger logger = LogManager.getLogger(Log4j2.class);
    private static final Logger tdrLogger = LogManager.getLogger("TDRLogger");
    private static final Logger syslogger = LogManager.getLogger("SYSLogger");
    private static final Logger errorlogger = LogManager.getLogger("ERRORLogger");
    private static final Logger minglogger = LogManager.getLogger("MINGLogger");
    private static final Logger bspolllogger = LogManager.getLogger("BSPOLLLogger");
    private static final Logger weblogger = LogManager.getLogger("WEBLogger");
    private static final Logger lsmslogger = LogManager.getLogger("LSMSLogger");
    private static final Logger bgprologger = LogManager.getLogger("LSMSBGPROAppender");
    private static final Logger mtlogger = LogManager.getLogger("MT_SYSLogger");
    private static final Logger mrlogger = LogManager.getLogger("MR_SYSLogger");
    private static final Logger imnplogger = LogManager.getLogger("IMNPLogger");
    private static final Logger mtmsglogger = LogManager.getLogger("MT_MSGLogger");

    public static void main(String[] args) {
    	
    	LoggerContext context = (LoggerContext) LogManager.getContext(false);
   		File file = new File("C:\\Spring-Projects\\log4j2.properties");
		context.setConfigLocation(file.toURI());
		logger.info("file loaded with lohgger");
		System.out.println("file loaded");
//    	Log4jLogger.getLogger(Log4j2.class).log(LogLevel.INFO,"Send INTM: "+ "456u768");
    	logger.debug("getllevel : "+logger.getLevel().intLevel());
    	logger.debug("getName : "+logger.getName());
        logger.trace("Trace Message!");
        logger.debug("Debug Message!");
        logger.info("Info Message!");
        logger.warn("Warn Message!");
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
//        tdrLogger.info("testing TDRLogger....");
//        Test.test();
//    	syslogger.debug("debug message");
//        syslogger.info("syslogger!");
//        syslogger.error("Error");
//        
//        errorlogger.debug("debug message of errorlogger");
//        errorlogger.info("errorlogger info !");
//        errorlogger.error("errorlogger Error");
////        
//        bspolllogger.debug("debug message of bspolllogger");
//        bspolllogger.info("bspolllogger info !");
//        bspolllogger.error("bspolllogger Error");
//        
//        lsmslogger.debug("debug message of lsmslogger");
//        lsmslogger.info("lsmslogger info !");
//        lsmslogger.error("lsmslogger Error");
//        
//        mtlogger.debug("debug message of mtlogger");
//        mtlogger.info("mtlogger info !");
//        mtlogger.error("mtlogger Error");
//        
//        mrlogger.debug("debug message of mrlogger");
//        mrlogger.info("mrlogger info !");
//        mrlogger.error("mrlogger Error");
//        
//        imnplogger.debug("debug message of imnplogger");
//        imnplogger.info("imnplogger info !");
//        imnplogger.error("imnplogger Error");
        
//        errorlogger.info("errorlogger");
//        minglogger.info("minglogger");
//        bspolllogger.info("bspolllogger");
//        weblogger.info("weblogger");
//        mtlogger.info("mtlogger");
//        mrlogger.info("mrlogger");
//        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
//		File file = new File("C:/Projects/logs/log4j.xml");
//		logger.info("Loading XML log File!");
//		context.setConfigLocation(file.toURI());
//		logger.info("XML FIle Loaded!");
        mtmsglogger.info("testing msg logger");
		
		
		
    
    }

}
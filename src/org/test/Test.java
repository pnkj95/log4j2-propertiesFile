package org.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.demo.Log4j2;

public class Test {

	private static final Logger logger = LogManager.getLogger(Test.class);
	public static void test() {
	
        logger.info("Info Message from Test!");
        logger.warn("Warn Message from Test!");
        logger.error("Error Message from Test!");
        logger.fatal("Fatal Message from Test!");

	}

}

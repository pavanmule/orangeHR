package log4jdemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemoxml {
	static Logger logger= LogManager.getLogger(Log4jDemoxml.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n hello     \n");
		logger.error("error message ");
		logger.warn("hi");
		logger.info("hi123");
	}

}

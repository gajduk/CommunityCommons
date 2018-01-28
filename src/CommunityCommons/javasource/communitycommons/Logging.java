package communitycommons;

import communitycommons.proxies.LogLevel;

public class Logging
{
	
	private static org.community_commons.main.Logging.LogLevel getLogLevel(LogLevel loglevel) {
		switch ( loglevel ) {
			case Critical: return org.community_commons.main.Logging.LogLevel.Critical; 
			case Debug: return org.community_commons.main.Logging.LogLevel.Debug; 
			case Error: return org.community_commons.main.Logging.LogLevel.Error; 
			case Info: return org.community_commons.main.Logging.LogLevel.Info; 
			case Trace: return org.community_commons.main.Logging.LogLevel.Trace; 
			case Warning: return org.community_commons.main.Logging.LogLevel.Warning;
			default: return org.community_commons.main.Logging.LogLevel.Info;
		}
	}
	

	public static void log(String lognode, LogLevel loglevel, String message)
	{
		org.community_commons.main.Logging.log(lognode, getLogLevel(loglevel), message, null);		
	}
	
	public static void log(String lognode, LogLevel loglevel, String message, Throwable e) {
		org.community_commons.main.Logging.log(lognode, getLogLevel(loglevel), message, e);
	}

	public static void simpleLog(String message)
	{
		org.community_commons.main.Logging.simpleLog(message);
	}

	
	public static Long measureEnd(String timerName, LogLevel loglevel,
			String message)
	{
		return org.community_commons.main.Logging.measureEnd(timerName,getLogLevel(loglevel),message);
	}

	public static void measureStart(String timerName)
	{
		org.community_commons.main.Logging.measureStart(timerName);
	}
	
	public static void createLogNode(String logNode) {
		org.community_commons.main.Logging.createLogNode(logNode);
	}
}

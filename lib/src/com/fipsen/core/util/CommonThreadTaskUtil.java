package com.fipsen.core.util;

import java.util.Date;

public class CommonThreadTaskUtil
{
	public synchronized static int getSleepTime(int feedHour, int feedMinute)
	{
		Date d = new Date();
		int currentHour = d.getHours();
		int currentMinute = d.getMinutes();
		int restHour = feedHour - currentHour;
		
		int restMinute = feedMinute - currentMinute;
		restHour = restHour * 60 * 60 * 1000;
		restMinute = restMinute * 60 * 1000;
		int totalMiliSeconds = restHour +  restMinute;
		
		if(totalMiliSeconds <= -1)
		{
			totalMiliSeconds = 86400000 + totalMiliSeconds;
		}
		
		return totalMiliSeconds;
	}

}

package com.liferay.challenge.util;

import com.liferay.challenge.log.LogConstants;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ConsolePrinter {
	
	
	public void print(String message) {
		_log.info(message);
	}
	
	private static Log _log = LogFactoryUtil.getLog(LogConstants.SCRIPT_CONSOLE_LOG_CATEGORY); 
	
}

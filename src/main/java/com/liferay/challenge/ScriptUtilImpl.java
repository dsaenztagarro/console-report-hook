package com.liferay.challenge;

import com.liferay.challenge.log.LogConstants;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

public class ScriptUtilImpl implements ScriptUtil {

	@Override
	public String operationOne() {
		return "Hello out there!";
	}
	
	@Override
	public String operationTwo(String name) {

        _log.debug("Inside of Operation Two");

        return "Hello " + name + "!"; 
	}
	
	private static Log _log = LogFactoryUtil.getLog(LogConstants.LOG_CATEGORY); 

}

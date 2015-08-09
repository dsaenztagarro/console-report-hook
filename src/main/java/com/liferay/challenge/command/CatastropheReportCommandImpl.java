
package com.liferay.challenge.command;

import java.util.ArrayList;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.PortletConfig;

import com.liferay.challenge.strategy.LeafStrategy;
import com.liferay.challenge.strategy.StrategyInterface;
import com.liferay.challenge.util.MessageBuilder;
import com.liferay.challenge.util.Writer;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class CatastropheReportCommandImpl {

	public CatastropheReportCommandImpl() {

		_strategy = new LeafStrategy();
	}

	public void setPortletConfig(PortletConfig _portletConfig) {

		this._portletConfig = _portletConfig;
	}

	public String run() {

		try {
			_log.debug("run: BEGIN");

			// TODO: Extract to portlet loading
			int userCount = UserLocalServiceUtil.getUsersCount();
			List<User> users = UserLocalServiceUtil.getUsers(0, userCount);
			for (User user : users) {
				long organizationId = processUser(user);
				System.out.println(organizationId);
			}

			Writer writer = new Writer();

			ArrayList<Integer> divisibleValues = new ArrayList<Integer>();
			divisibleValues.add(3);
			divisibleValues.add(5);

			// MessageBuilder messageBuilder = new
			// MessageBuilder(_portletConfig);

			String message =
				MessageBuilder.build("Liferay Inc.", divisibleValues);

			writer.print(message);

			return message;
		}
		catch (PortalException | SystemException exception) {
			return "Fail";
		}
	}

	private long processUser(User user)
		throws PortalException, SystemException {

		_log.debug("User Name: " + user.getFullName());
		List<Organization> organizations = user.getOrganizations();
		long organizationId =
			_strategy.chooseOneOf(organizations).getOrganizationId();
		return organizationId;
	}

	private PortletConfig _portletConfig;
	private ActionRequest _actionRequest;
	private StrategyInterface _strategy;
	private static Log _log =
		LogFactoryUtil.getLog(CatastropheReportCommandImpl.class);

}

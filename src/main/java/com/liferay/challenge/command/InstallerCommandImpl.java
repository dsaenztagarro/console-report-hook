
package com.liferay.challenge.command;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.PortletConfig;

import com.liferay.challenge.model.UsersCatastropheOrgs;
import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;
import com.liferay.challenge.strategy.StrategyInterface;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Organization;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class InstallerCommandImpl implements InstallerCommand {

	public void setPortletConfig(PortletConfig _portletConfig) {

		this._portletConfig = _portletConfig;
	}

	public boolean run() {

		try {
			_log.debug("run: BEGIN");

			int userCount = UserLocalServiceUtil.getUsersCount();
			List<User> users = UserLocalServiceUtil.getUsers(0, userCount);
			for (User user : users) {
				UsersCatastropheOrgs model = processUser(user);
				System.out.println(model.getOrganizationId());
			}
			return true;
		}
		catch (PortalException | SystemException exception) {
			return false;
		}
	}

	private UsersCatastropheOrgs processUser(User user)
		throws PortalException, SystemException {

		_log.debug("User Name: " + user.getFullName());
		List<Organization> organizations = user.getOrganizations();
		long organizationId =
			_strategy.chooseOneOf(organizations).getOrganizationId();

		return UsersCatastropheOrgsLocalServiceUtil.updateUsersCatastropheOrgs(user.getUserId(), organizationId);
	}

	private PortletConfig _portletConfig;
	private ActionRequest _actionRequest;
	private StrategyInterface _strategy;
	private static Log _log =
		LogFactoryUtil.getLog(InstallerCommandImpl.class);

}


package com.liferay.challenge.command;

import java.util.ArrayList;
import java.util.List;

import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;
import com.liferay.challenge.util.ConsolePrinter;
import com.liferay.challenge.util.MessageBuilder;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;

public class CatastropheReportCommandImpl {

	public CatastropheReportCommandImpl() {

		_printer = new ConsolePrinter();
	}

	public boolean run() {

		try {
			int organizationCount =
				OrganizationLocalServiceUtil.getOrganizationsCount();
			List<Organization> organizations =
				OrganizationLocalServiceUtil.getOrganizations(
					0, organizationCount);
			for (Organization organization : organizations) {
				processOrganization(organization);
			}
			return true;
		}
		catch (SystemException exception) {
			return false;
		}
	}

	private void processOrganization(Organization organization) {

		long count =
			UsersCatastropheOrgsLocalServiceUtil.countOrganizationUsers(organization.getOrganizationId());

		ArrayList<Integer> divisibleValues = new ArrayList<Integer>();
		divisibleValues.add(3);
		divisibleValues.add(5);

		String message =
			MessageBuilder.build(organization.getName(), divisibleValues);
		_printer.print(message);
	}

	private ConsolePrinter _printer;
	private static Log _log =
		LogFactoryUtil.getLog(CatastropheReportCommandImpl.class);

}

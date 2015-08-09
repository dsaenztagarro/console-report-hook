
package com.liferay.challenge.command;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;
import com.liferay.challenge.util.ConsolePrinter;
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
		_printer.print("run#begin");
		try {
			int organizationCount =
				OrganizationLocalServiceUtil.getOrganizationsCount();
			_printer.print("organizationCount: " + organizationCount);
			List<Organization> organizations =
				OrganizationLocalServiceUtil.getOrganizations(
					0, organizationCount);

			Map<Long, Organization> map = new HashMap<Long, Organization>();
			for (Organization org : organizations)
				map.put(org.getOrganizationId(), org);
			_printer.print("trace1");
			List<Object[]> results =
				UsersCatastropheOrgsLocalServiceUtil.countOrganizationUsers(1);


			_printer.print("trace2");
			for (Object[] r : results) {
				long organizationId = (long) r[0];
				long count = (long) r[1];
				_printer.print("OrganizationId: " + organizationId +
					" Count: " + count);

				/*
				ArrayList<Integer> divisibleValues = new ArrayList<Integer>();
				divisibleValues.add(3);
				divisibleValues.add(5);

				String message =
					MessageBuilder.build(
						organization.getName(), divisibleValues);
				_printer.print(message);
				*/
			}
			return true;
		}
		catch (SystemException exception) {
			return false;
		}
	}

	private ConsolePrinter _printer;
	private static Log _log =
		LogFactoryUtil.getLog(CatastropheReportCommandImpl.class);

}

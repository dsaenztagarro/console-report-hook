
package com.liferay.challenge.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.liferay.portal.model.Organization;

public class LeafStrategy implements StrategyInterface {

	/*
	 * (non-Javadoc)
	 * @see
	 * com.liferay.challenge.strategy.StrategyInterface#chooseOneOf(java.util
	 * .List)
	 */
	public LeafStrategy chooseOneOf(List<Organization> organizations) {

		_organizations = organizations;
		_organizationChose = null;
		filterByLengthTreePath();
		filterByMoreRecent();
		_organizationChose = _organizations.get(0);
		return this;
	}

	/*
	 * (non-Javadoc)
	 * @see com.liferay.challenge.strategy.StrategyInterface#getOrganizationId()
	 */
	public long getOrganizationId() {

		if (_organizationChose != null) {
			return _organizationChose.getOrganizationId();
		}
		return -1;
	}

	/**
	 * 1st Criteria: If a user belongs to multiple organizations sharing tree
	 * path, for example "Liferay Inc" ('/20585') and "Liferay Chicago"
	 * ('/20585/20601') then we filter companies with a longer tree path as they
	 * show a more specific role for the user.
	 */
	private void filterByLengthTreePath() {

		if (_organizations.size() > 1) {
			ArrayList<Organization> filteredList =
				new ArrayList<Organization>();
			int maxLength = 0;
			for (Organization org : _organizations) {
				int length = org.getTreePath().split("/").length;
				if (length > maxLength) {
					filteredList.clear();
					maxLength = length;
					filteredList.add(org);
				}
				else if (length == maxLength) {
					filteredList.add(org);
				}
			}
			_organizations = filteredList;
		}
	}

	/**
	 * 2nd Criteria: If a user belongs to multiple organizations with equal
	 * treePath length, then we reduce list to the most recent created
	 * organization
	 */
	private void filterByMoreRecent() {

		if (_organizations.size() > 1) {
			Organization currOrg = null;
			long currTime = 0;
			for (Organization org : _organizations) {
				long newTime = org.getCreateDate().getTime();
				if (newTime - currTime > 0) {
					currTime = newTime;
					currOrg = org;
				}
			}
			_organizations = Arrays.asList(currOrg);
		}
	}

	private List<Organization> _organizations;
	private Organization _organizationChose;

}

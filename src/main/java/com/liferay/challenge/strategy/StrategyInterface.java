package com.liferay.challenge.strategy;

import java.util.List;

import com.liferay.portal.model.Organization;

public interface StrategyInterface {
	
	public StrategyInterface chooseOneOf(List<Organization> organizations);
	
	public long getOrganizationId();

}

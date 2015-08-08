
package com.liferay.challenge.strategy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.liferay.portal.kernel.test.NewClassLoaderJUnitTestRunner;
import com.liferay.portal.model.Organization;

@RunWith(NewClassLoaderJUnitTestRunner.class)
public class LeafStrategyTest {

	@Test
	public void testOneOrganization() {

		Organization org1 = getOrganizationMock(1, "/1/", null);

		List<Organization> organizations = Arrays.asList(org1);

		assertEquals(org1.getOrganizationId(), getStrategyResult(organizations));
	}

	@Test
	public void testLongerTreePath() {

		Organization org1 = getOrganizationMock(1, "/1/", null);
		Organization org2 = getOrganizationMock(2, "/1/2/", null);
		Organization org3 = getOrganizationMock(3, "/1/2/3", null);

		List<Organization> organizations = Arrays.asList(org1, org2, org3);

		assertEquals(org3.getOrganizationId(), getStrategyResult(organizations));
	}

	@Test
	public void testMoreRecentCreationDate() {

		Organization org1 =
			getOrganizationMock(1, "/1/", dateFromString("15/06/2011"));
		Organization org2 =
			getOrganizationMock(2, "/2/", dateFromString("01/01/2015"));
		Organization org3 =
			getOrganizationMock(3, "/3/", dateFromString("13/12/1979"));

		List<Organization> organizations = Arrays.asList(org1, org2, org3);

		long id = getStrategyResult(organizations);
		assertEquals(org2.getOrganizationId(), id);
	}

	@Test
	public void testMoreRecentCreateDate() {

		Organization org1 = getOrganizationMock(1, "/1/", dateFromString("01/01/2011"));
		Organization org2 =
			getOrganizationMock(2, "/1/2/", dateFromString("01/01/2011"));
		Organization org3 =
			getOrganizationMock(3, "/1/2/3/", dateFromString("01/01/2015"));
		Organization org4 =
			getOrganizationMock(4, "/1/2/4/", dateFromString("15/01/2015"));

		List<Organization> organizations = Arrays.asList(org1, org2, org3, org4);

		assertEquals(org4.getOrganizationId(), getStrategyResult(organizations));
	}

	private long getStrategyResult(List<Organization> organizations) {

		LeafStrategy strategy = new LeafStrategy();
		strategy.chooseOneOf(organizations);
		return strategy.getOrganizationId();
	}

	private Organization getOrganizationMock(
		final long orgId, final String treePath, Date date) {

		Organization org = mock(Organization.class);
		when(org.getOrganizationId()).thenReturn(orgId);
		when(org.getTreePath()).thenReturn(treePath);
		when(org.getCreateDate()).thenReturn(date);
		return org;
	}

	private Date dateFromString(String strDate) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.parse(strDate);
		}
		catch (ParseException e) {
			fail("Invalid string format for Date");
			return null;
		}
	}

}

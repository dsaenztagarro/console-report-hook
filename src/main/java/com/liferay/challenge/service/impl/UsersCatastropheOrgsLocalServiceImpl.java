
package com.liferay.challenge.service.impl;

import java.util.List;

import com.liferay.challenge.model.UsersCatastropheOrgs;
import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;
import com.liferay.challenge.service.base.UsersCatastropheOrgsLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionList;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;

/**
 * The implementation of the users catastrophe orgs local service. <p> All
 * custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.challenge.service.UsersCatastropheOrgsLocalService}
 * interface. <p> This is a local service. Methods of this service will not have
 * security checks based on the propagated JAAS credentials because this service
 * can only be accessed from within the same VM. </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.challenge.service.base.UsersCatastropheOrgsLocalServiceBaseImpl
 * @see com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil
 */
public class UsersCatastropheOrgsLocalServiceImpl
	extends UsersCatastropheOrgsLocalServiceBaseImpl {

	/*
	 * (non-Javadoc)
	 * @see com.liferay.challenge.service.UsersCatastropheOrgsLocalService#
	 * updateUsersCatastropheOrgs(long, long)
	 */
	public UsersCatastropheOrgs updateUsersCatastropheOrgs(
		long userId, long organizationId)
		throws SystemException {

		UsersCatastropheOrgs model =
			UsersCatastropheOrgsLocalServiceUtil.createUsersCatastropheOrgs(userId);
		model.setOrganizationId(organizationId);

		return usersCatastropheOrgsPersistence.update(model);
	}

	@SuppressWarnings("rawtypes")
	public List countOrganizationUsers(long organizationId) throws SystemException {

		ProjectionList plist = ProjectionFactoryUtil.projectionList();
		plist.add(ProjectionFactoryUtil.groupProperty("organizationId"));
		plist.add(ProjectionFactoryUtil.rowCount(), "_count");

		DynamicQuery querySub =
			DynamicQueryFactoryUtil.forClass(
				UsersCatastropheOrgs.class,
				PortalClassLoaderUtil.getClassLoader()).setProjection(plist).addOrder(
				OrderFactoryUtil.desc("_count"));
		
		DynamicQuery query = DynamicQueryFactoryUtil.forClass(AssetEntry.class, PortalClassLoaderUtil.getClassLoader())
						 .add(PropertyFactoryUtil.forName("organizationId").in(querySub));
		
		List results = AssetEntryLocalServiceUtil.dynamicQuery(query);
		return results;
	}

}

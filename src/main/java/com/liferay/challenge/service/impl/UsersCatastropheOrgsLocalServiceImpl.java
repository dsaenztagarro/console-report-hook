
package com.liferay.challenge.service.impl;

import com.liferay.challenge.NoSuchUsersCatastropheOrgsException;
import com.liferay.challenge.model.UsersCatastropheOrgs;
import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;
import com.liferay.challenge.service.base.UsersCatastropheOrgsLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

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

	public UsersCatastropheOrgs updateUsersCatastropheOrgs(
		long userId, long organizationId)
		throws SystemException {

		UsersCatastropheOrgs model =
			UsersCatastropheOrgsLocalServiceUtil.createUsersCatastropheOrgs(userId);
		model.setOrganizationId(organizationId);

		return usersCatastropheOrgsPersistence.update(model);
	}

}

package com.liferay.challenge.service.persistence;

import com.liferay.challenge.model.UsersCatastropheOrgs;
import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UsersCatastropheOrgsActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UsersCatastropheOrgsActionableDynamicQuery()
        throws SystemException {
        setBaseLocalService(UsersCatastropheOrgsLocalServiceUtil.getService());
        setClass(UsersCatastropheOrgs.class);

        setClassLoader(com.liferay.challenge.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("userId");
    }
}

package com.liferay.challenge.service.impl;

import java.util.List;

import com.liferay.challenge.model.UsersCatastropheOrgs;
import com.liferay.challenge.service.base.UsersCatastropheOrgsServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionList;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;

/**
 * The implementation of the users catastrophe orgs remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.challenge.service.UsersCatastropheOrgsService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.challenge.service.base.UsersCatastropheOrgsServiceBaseImpl
 * @see com.liferay.challenge.service.UsersCatastropheOrgsServiceUtil
 */
public class UsersCatastropheOrgsServiceImpl
    extends UsersCatastropheOrgsServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.liferay.challenge.service.UsersCatastropheOrgsServiceUtil} to access the users catastrophe orgs remote service.
     */

}

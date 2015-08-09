package com.liferay.challenge.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for UsersCatastropheOrgs. This utility wraps
 * {@link com.liferay.challenge.service.impl.UsersCatastropheOrgsLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgsLocalService
 * @see com.liferay.challenge.service.base.UsersCatastropheOrgsLocalServiceBaseImpl
 * @see com.liferay.challenge.service.impl.UsersCatastropheOrgsLocalServiceImpl
 * @generated
 */
public class UsersCatastropheOrgsLocalServiceUtil {
    private static UsersCatastropheOrgsLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.liferay.challenge.service.impl.UsersCatastropheOrgsLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the users catastrophe orgs to the database. Also notifies the appropriate model listeners.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    * @return the users catastrophe orgs that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs addUsersCatastropheOrgs(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addUsersCatastropheOrgs(usersCatastropheOrgs);
    }

    /**
    * Creates a new users catastrophe orgs with the primary key. Does not add the users catastrophe orgs to the database.
    *
    * @param userId the primary key for the new users catastrophe orgs
    * @return the new users catastrophe orgs
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs createUsersCatastropheOrgs(
        long userId) {
        return getService().createUsersCatastropheOrgs(userId);
    }

    /**
    * Deletes the users catastrophe orgs with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs that was removed
    * @throws PortalException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs deleteUsersCatastropheOrgs(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUsersCatastropheOrgs(userId);
    }

    /**
    * Deletes the users catastrophe orgs from the database. Also notifies the appropriate model listeners.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    * @return the users catastrophe orgs that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs deleteUsersCatastropheOrgs(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteUsersCatastropheOrgs(usersCatastropheOrgs);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.challenge.model.impl.UsersCatastropheOrgsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.challenge.model.impl.UsersCatastropheOrgsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.liferay.challenge.model.UsersCatastropheOrgs fetchUsersCatastropheOrgs(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchUsersCatastropheOrgs(userId);
    }

    /**
    * Returns the users catastrophe orgs with the primary key.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs
    * @throws PortalException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs getUsersCatastropheOrgs(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getUsersCatastropheOrgs(userId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the users catastrophe orgses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.challenge.model.impl.UsersCatastropheOrgsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of users catastrophe orgses
    * @param end the upper bound of the range of users catastrophe orgses (not inclusive)
    * @return the range of users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> getUsersCatastropheOrgses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUsersCatastropheOrgses(start, end);
    }

    /**
    * Returns the number of users catastrophe orgses.
    *
    * @return the number of users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    public static int getUsersCatastropheOrgsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getUsersCatastropheOrgsesCount();
    }

    /**
    * Updates the users catastrophe orgs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    * @return the users catastrophe orgs that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs updateUsersCatastropheOrgs(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateUsersCatastropheOrgs(usersCatastropheOrgs);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.liferay.challenge.model.UsersCatastropheOrgs updateUsersCatastropheOrgs(
        long userId, long organizationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateUsersCatastropheOrgs(userId, organizationId);
    }

    public static void clearService() {
        _service = null;
    }

    public static UsersCatastropheOrgsLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    UsersCatastropheOrgsLocalService.class.getName());

            if (invokableLocalService instanceof UsersCatastropheOrgsLocalService) {
                _service = (UsersCatastropheOrgsLocalService) invokableLocalService;
            } else {
                _service = new UsersCatastropheOrgsLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(UsersCatastropheOrgsLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(UsersCatastropheOrgsLocalService service) {
    }
}

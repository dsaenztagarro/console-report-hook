package com.liferay.challenge.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsersCatastropheOrgsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgsLocalService
 * @generated
 */
public class UsersCatastropheOrgsLocalServiceWrapper
    implements UsersCatastropheOrgsLocalService,
        ServiceWrapper<UsersCatastropheOrgsLocalService> {
    private UsersCatastropheOrgsLocalService _usersCatastropheOrgsLocalService;

    public UsersCatastropheOrgsLocalServiceWrapper(
        UsersCatastropheOrgsLocalService usersCatastropheOrgsLocalService) {
        _usersCatastropheOrgsLocalService = usersCatastropheOrgsLocalService;
    }

    /**
    * Adds the users catastrophe orgs to the database. Also notifies the appropriate model listeners.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    * @return the users catastrophe orgs that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs addUsersCatastropheOrgs(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.addUsersCatastropheOrgs(usersCatastropheOrgs);
    }

    /**
    * Creates a new users catastrophe orgs with the primary key. Does not add the users catastrophe orgs to the database.
    *
    * @param userId the primary key for the new users catastrophe orgs
    * @return the new users catastrophe orgs
    */
    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs createUsersCatastropheOrgs(
        long userId) {
        return _usersCatastropheOrgsLocalService.createUsersCatastropheOrgs(userId);
    }

    /**
    * Deletes the users catastrophe orgs with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs that was removed
    * @throws PortalException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs deleteUsersCatastropheOrgs(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.deleteUsersCatastropheOrgs(userId);
    }

    /**
    * Deletes the users catastrophe orgs from the database. Also notifies the appropriate model listeners.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    * @return the users catastrophe orgs that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs deleteUsersCatastropheOrgs(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.deleteUsersCatastropheOrgs(usersCatastropheOrgs);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _usersCatastropheOrgsLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.dynamicQuery(dynamicQuery,
            start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs fetchUsersCatastropheOrgs(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.fetchUsersCatastropheOrgs(userId);
    }

    /**
    * Returns the users catastrophe orgs with the primary key.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs
    * @throws PortalException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs getUsersCatastropheOrgs(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.getUsersCatastropheOrgs(userId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> getUsersCatastropheOrgses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.getUsersCatastropheOrgses(start,
            end);
    }

    /**
    * Returns the number of users catastrophe orgses.
    *
    * @return the number of users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getUsersCatastropheOrgsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.getUsersCatastropheOrgsesCount();
    }

    /**
    * Updates the users catastrophe orgs in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    * @return the users catastrophe orgs that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs updateUsersCatastropheOrgs(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.updateUsersCatastropheOrgs(usersCatastropheOrgs);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usersCatastropheOrgsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usersCatastropheOrgsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usersCatastropheOrgsLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs updateUsersCatastropheOrgs(
        long userId, long organizationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgsLocalService.updateUsersCatastropheOrgs(userId,
            organizationId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsersCatastropheOrgsLocalService getWrappedUsersCatastropheOrgsLocalService() {
        return _usersCatastropheOrgsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsersCatastropheOrgsLocalService(
        UsersCatastropheOrgsLocalService usersCatastropheOrgsLocalService) {
        _usersCatastropheOrgsLocalService = usersCatastropheOrgsLocalService;
    }

    @Override
    public UsersCatastropheOrgsLocalService getWrappedService() {
        return _usersCatastropheOrgsLocalService;
    }

    @Override
    public void setWrappedService(
        UsersCatastropheOrgsLocalService usersCatastropheOrgsLocalService) {
        _usersCatastropheOrgsLocalService = usersCatastropheOrgsLocalService;
    }
}

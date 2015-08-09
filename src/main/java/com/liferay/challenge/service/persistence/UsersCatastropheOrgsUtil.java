package com.liferay.challenge.service.persistence;

import com.liferay.challenge.model.UsersCatastropheOrgs;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the users catastrophe orgs service. This utility wraps {@link UsersCatastropheOrgsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgsPersistence
 * @see UsersCatastropheOrgsPersistenceImpl
 * @generated
 */
public class UsersCatastropheOrgsUtil {
    private static UsersCatastropheOrgsPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(UsersCatastropheOrgs usersCatastropheOrgs) {
        getPersistence().clearCache(usersCatastropheOrgs);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<UsersCatastropheOrgs> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<UsersCatastropheOrgs> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<UsersCatastropheOrgs> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static UsersCatastropheOrgs update(
        UsersCatastropheOrgs usersCatastropheOrgs) throws SystemException {
        return getPersistence().update(usersCatastropheOrgs);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static UsersCatastropheOrgs update(
        UsersCatastropheOrgs usersCatastropheOrgs, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(usersCatastropheOrgs, serviceContext);
    }

    /**
    * Caches the users catastrophe orgs in the entity cache if it is enabled.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    */
    public static void cacheResult(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs) {
        getPersistence().cacheResult(usersCatastropheOrgs);
    }

    /**
    * Caches the users catastrophe orgses in the entity cache if it is enabled.
    *
    * @param usersCatastropheOrgses the users catastrophe orgses
    */
    public static void cacheResult(
        java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> usersCatastropheOrgses) {
        getPersistence().cacheResult(usersCatastropheOrgses);
    }

    /**
    * Creates a new users catastrophe orgs with the primary key. Does not add the users catastrophe orgs to the database.
    *
    * @param userId the primary key for the new users catastrophe orgs
    * @return the new users catastrophe orgs
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs create(
        long userId) {
        return getPersistence().create(userId);
    }

    /**
    * Removes the users catastrophe orgs with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs that was removed
    * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs remove(
        long userId)
        throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(userId);
    }

    public static com.liferay.challenge.model.UsersCatastropheOrgs updateImpl(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(usersCatastropheOrgs);
    }

    /**
    * Returns the users catastrophe orgs with the primary key or throws a {@link com.liferay.challenge.NoSuchUsersCatastropheOrgsException} if it could not be found.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs
    * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs findByPrimaryKey(
        long userId)
        throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(userId);
    }

    /**
    * Returns the users catastrophe orgs with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs, or <code>null</code> if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.liferay.challenge.model.UsersCatastropheOrgs fetchByPrimaryKey(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userId);
    }

    /**
    * Returns all the users catastrophe orgses.
    *
    * @return the users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the users catastrophe orgses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.challenge.model.impl.UsersCatastropheOrgsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of users catastrophe orgses
    * @param end the upper bound of the range of users catastrophe orgses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the users catastrophe orgses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of users catastrophe orgses.
    *
    * @return the number of users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static UsersCatastropheOrgsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (UsersCatastropheOrgsPersistence) PortletBeanLocatorUtil.locate(com.liferay.challenge.service.ClpSerializer.getServletContextName(),
                    UsersCatastropheOrgsPersistence.class.getName());

            ReferenceRegistry.registerReference(UsersCatastropheOrgsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(UsersCatastropheOrgsPersistence persistence) {
    }
}

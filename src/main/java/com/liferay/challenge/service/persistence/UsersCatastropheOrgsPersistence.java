package com.liferay.challenge.service.persistence;

import com.liferay.challenge.model.UsersCatastropheOrgs;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the users catastrophe orgs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgsPersistenceImpl
 * @see UsersCatastropheOrgsUtil
 * @generated
 */
public interface UsersCatastropheOrgsPersistence extends BasePersistence<UsersCatastropheOrgs> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link UsersCatastropheOrgsUtil} to access the users catastrophe orgs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the users catastrophe orgs in the entity cache if it is enabled.
    *
    * @param usersCatastropheOrgs the users catastrophe orgs
    */
    public void cacheResult(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs);

    /**
    * Caches the users catastrophe orgses in the entity cache if it is enabled.
    *
    * @param usersCatastropheOrgses the users catastrophe orgses
    */
    public void cacheResult(
        java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> usersCatastropheOrgses);

    /**
    * Creates a new users catastrophe orgs with the primary key. Does not add the users catastrophe orgs to the database.
    *
    * @param userId the primary key for the new users catastrophe orgs
    * @return the new users catastrophe orgs
    */
    public com.liferay.challenge.model.UsersCatastropheOrgs create(long userId);

    /**
    * Removes the users catastrophe orgs with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs that was removed
    * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.challenge.model.UsersCatastropheOrgs remove(long userId)
        throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.challenge.model.UsersCatastropheOrgs updateImpl(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the users catastrophe orgs with the primary key or throws a {@link com.liferay.challenge.NoSuchUsersCatastropheOrgsException} if it could not be found.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs
    * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.challenge.model.UsersCatastropheOrgs findByPrimaryKey(
        long userId)
        throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the users catastrophe orgs with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the users catastrophe orgs
    * @return the users catastrophe orgs, or <code>null</code> if a users catastrophe orgs with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.liferay.challenge.model.UsersCatastropheOrgs fetchByPrimaryKey(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the users catastrophe orgses.
    *
    * @return the users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.liferay.challenge.model.UsersCatastropheOrgs> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the users catastrophe orgses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of users catastrophe orgses.
    *
    * @return the number of users catastrophe orgses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}

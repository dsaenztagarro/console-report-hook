package com.liferay.challenge.service.persistence;

import com.liferay.challenge.NoSuchUsersCatastropheOrgsException;
import com.liferay.challenge.model.UsersCatastropheOrgs;
import com.liferay.challenge.model.impl.UsersCatastropheOrgsImpl;
import com.liferay.challenge.model.impl.UsersCatastropheOrgsModelImpl;
import com.liferay.challenge.service.persistence.UsersCatastropheOrgsPersistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the users catastrophe orgs service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgsPersistence
 * @see UsersCatastropheOrgsUtil
 * @generated
 */
public class UsersCatastropheOrgsPersistenceImpl extends BasePersistenceImpl<UsersCatastropheOrgs>
    implements UsersCatastropheOrgsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link UsersCatastropheOrgsUtil} to access the users catastrophe orgs persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = UsersCatastropheOrgsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
            UsersCatastropheOrgsModelImpl.FINDER_CACHE_ENABLED,
            UsersCatastropheOrgsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
            UsersCatastropheOrgsModelImpl.FINDER_CACHE_ENABLED,
            UsersCatastropheOrgsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
            UsersCatastropheOrgsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_USERSCATASTROPHEORGS = "SELECT usersCatastropheOrgs FROM UsersCatastropheOrgs usersCatastropheOrgs";
    private static final String _SQL_COUNT_USERSCATASTROPHEORGS = "SELECT COUNT(usersCatastropheOrgs) FROM UsersCatastropheOrgs usersCatastropheOrgs";
    private static final String _ORDER_BY_ENTITY_ALIAS = "usersCatastropheOrgs.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UsersCatastropheOrgs exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(UsersCatastropheOrgsPersistenceImpl.class);
    private static UsersCatastropheOrgs _nullUsersCatastropheOrgs = new UsersCatastropheOrgsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<UsersCatastropheOrgs> toCacheModel() {
                return _nullUsersCatastropheOrgsCacheModel;
            }
        };

    private static CacheModel<UsersCatastropheOrgs> _nullUsersCatastropheOrgsCacheModel =
        new CacheModel<UsersCatastropheOrgs>() {
            @Override
            public UsersCatastropheOrgs toEntityModel() {
                return _nullUsersCatastropheOrgs;
            }
        };

    public UsersCatastropheOrgsPersistenceImpl() {
        setModelClass(UsersCatastropheOrgs.class);
    }

    /**
     * Caches the users catastrophe orgs in the entity cache if it is enabled.
     *
     * @param usersCatastropheOrgs the users catastrophe orgs
     */
    @Override
    public void cacheResult(UsersCatastropheOrgs usersCatastropheOrgs) {
        EntityCacheUtil.putResult(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
            UsersCatastropheOrgsImpl.class,
            usersCatastropheOrgs.getPrimaryKey(), usersCatastropheOrgs);

        usersCatastropheOrgs.resetOriginalValues();
    }

    /**
     * Caches the users catastrophe orgses in the entity cache if it is enabled.
     *
     * @param usersCatastropheOrgses the users catastrophe orgses
     */
    @Override
    public void cacheResult(List<UsersCatastropheOrgs> usersCatastropheOrgses) {
        for (UsersCatastropheOrgs usersCatastropheOrgs : usersCatastropheOrgses) {
            if (EntityCacheUtil.getResult(
                        UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
                        UsersCatastropheOrgsImpl.class,
                        usersCatastropheOrgs.getPrimaryKey()) == null) {
                cacheResult(usersCatastropheOrgs);
            } else {
                usersCatastropheOrgs.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all users catastrophe orgses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(UsersCatastropheOrgsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(UsersCatastropheOrgsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the users catastrophe orgs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(UsersCatastropheOrgs usersCatastropheOrgs) {
        EntityCacheUtil.removeResult(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
            UsersCatastropheOrgsImpl.class, usersCatastropheOrgs.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<UsersCatastropheOrgs> usersCatastropheOrgses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (UsersCatastropheOrgs usersCatastropheOrgs : usersCatastropheOrgses) {
            EntityCacheUtil.removeResult(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
                UsersCatastropheOrgsImpl.class,
                usersCatastropheOrgs.getPrimaryKey());
        }
    }

    /**
     * Creates a new users catastrophe orgs with the primary key. Does not add the users catastrophe orgs to the database.
     *
     * @param userId the primary key for the new users catastrophe orgs
     * @return the new users catastrophe orgs
     */
    @Override
    public UsersCatastropheOrgs create(long userId) {
        UsersCatastropheOrgs usersCatastropheOrgs = new UsersCatastropheOrgsImpl();

        usersCatastropheOrgs.setNew(true);
        usersCatastropheOrgs.setPrimaryKey(userId);

        return usersCatastropheOrgs;
    }

    /**
     * Removes the users catastrophe orgs with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the users catastrophe orgs
     * @return the users catastrophe orgs that was removed
     * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsersCatastropheOrgs remove(long userId)
        throws NoSuchUsersCatastropheOrgsException, SystemException {
        return remove((Serializable) userId);
    }

    /**
     * Removes the users catastrophe orgs with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the users catastrophe orgs
     * @return the users catastrophe orgs that was removed
     * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsersCatastropheOrgs remove(Serializable primaryKey)
        throws NoSuchUsersCatastropheOrgsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            UsersCatastropheOrgs usersCatastropheOrgs = (UsersCatastropheOrgs) session.get(UsersCatastropheOrgsImpl.class,
                    primaryKey);

            if (usersCatastropheOrgs == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchUsersCatastropheOrgsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(usersCatastropheOrgs);
        } catch (NoSuchUsersCatastropheOrgsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected UsersCatastropheOrgs removeImpl(
        UsersCatastropheOrgs usersCatastropheOrgs) throws SystemException {
        usersCatastropheOrgs = toUnwrappedModel(usersCatastropheOrgs);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(usersCatastropheOrgs)) {
                usersCatastropheOrgs = (UsersCatastropheOrgs) session.get(UsersCatastropheOrgsImpl.class,
                        usersCatastropheOrgs.getPrimaryKeyObj());
            }

            if (usersCatastropheOrgs != null) {
                session.delete(usersCatastropheOrgs);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (usersCatastropheOrgs != null) {
            clearCache(usersCatastropheOrgs);
        }

        return usersCatastropheOrgs;
    }

    @Override
    public UsersCatastropheOrgs updateImpl(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs)
        throws SystemException {
        usersCatastropheOrgs = toUnwrappedModel(usersCatastropheOrgs);

        boolean isNew = usersCatastropheOrgs.isNew();

        Session session = null;

        try {
            session = openSession();

            if (usersCatastropheOrgs.isNew()) {
                session.save(usersCatastropheOrgs);

                usersCatastropheOrgs.setNew(false);
            } else {
                session.merge(usersCatastropheOrgs);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
            UsersCatastropheOrgsImpl.class,
            usersCatastropheOrgs.getPrimaryKey(), usersCatastropheOrgs);

        return usersCatastropheOrgs;
    }

    protected UsersCatastropheOrgs toUnwrappedModel(
        UsersCatastropheOrgs usersCatastropheOrgs) {
        if (usersCatastropheOrgs instanceof UsersCatastropheOrgsImpl) {
            return usersCatastropheOrgs;
        }

        UsersCatastropheOrgsImpl usersCatastropheOrgsImpl = new UsersCatastropheOrgsImpl();

        usersCatastropheOrgsImpl.setNew(usersCatastropheOrgs.isNew());
        usersCatastropheOrgsImpl.setPrimaryKey(usersCatastropheOrgs.getPrimaryKey());

        usersCatastropheOrgsImpl.setUserId(usersCatastropheOrgs.getUserId());
        usersCatastropheOrgsImpl.setOrganizationId(usersCatastropheOrgs.getOrganizationId());

        return usersCatastropheOrgsImpl;
    }

    /**
     * Returns the users catastrophe orgs with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the users catastrophe orgs
     * @return the users catastrophe orgs
     * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsersCatastropheOrgs findByPrimaryKey(Serializable primaryKey)
        throws NoSuchUsersCatastropheOrgsException, SystemException {
        UsersCatastropheOrgs usersCatastropheOrgs = fetchByPrimaryKey(primaryKey);

        if (usersCatastropheOrgs == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchUsersCatastropheOrgsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return usersCatastropheOrgs;
    }

    /**
     * Returns the users catastrophe orgs with the primary key or throws a {@link com.liferay.challenge.NoSuchUsersCatastropheOrgsException} if it could not be found.
     *
     * @param userId the primary key of the users catastrophe orgs
     * @return the users catastrophe orgs
     * @throws com.liferay.challenge.NoSuchUsersCatastropheOrgsException if a users catastrophe orgs with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsersCatastropheOrgs findByPrimaryKey(long userId)
        throws NoSuchUsersCatastropheOrgsException, SystemException {
        return findByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns the users catastrophe orgs with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the users catastrophe orgs
     * @return the users catastrophe orgs, or <code>null</code> if a users catastrophe orgs with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsersCatastropheOrgs fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        UsersCatastropheOrgs usersCatastropheOrgs = (UsersCatastropheOrgs) EntityCacheUtil.getResult(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
                UsersCatastropheOrgsImpl.class, primaryKey);

        if (usersCatastropheOrgs == _nullUsersCatastropheOrgs) {
            return null;
        }

        if (usersCatastropheOrgs == null) {
            Session session = null;

            try {
                session = openSession();

                usersCatastropheOrgs = (UsersCatastropheOrgs) session.get(UsersCatastropheOrgsImpl.class,
                        primaryKey);

                if (usersCatastropheOrgs != null) {
                    cacheResult(usersCatastropheOrgs);
                } else {
                    EntityCacheUtil.putResult(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
                        UsersCatastropheOrgsImpl.class, primaryKey,
                        _nullUsersCatastropheOrgs);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(UsersCatastropheOrgsModelImpl.ENTITY_CACHE_ENABLED,
                    UsersCatastropheOrgsImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return usersCatastropheOrgs;
    }

    /**
     * Returns the users catastrophe orgs with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userId the primary key of the users catastrophe orgs
     * @return the users catastrophe orgs, or <code>null</code> if a users catastrophe orgs with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public UsersCatastropheOrgs fetchByPrimaryKey(long userId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) userId);
    }

    /**
     * Returns all the users catastrophe orgses.
     *
     * @return the users catastrophe orgses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<UsersCatastropheOrgs> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<UsersCatastropheOrgs> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<UsersCatastropheOrgs> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<UsersCatastropheOrgs> list = (List<UsersCatastropheOrgs>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_USERSCATASTROPHEORGS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_USERSCATASTROPHEORGS;

                if (pagination) {
                    sql = sql.concat(UsersCatastropheOrgsModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<UsersCatastropheOrgs>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<UsersCatastropheOrgs>(list);
                } else {
                    list = (List<UsersCatastropheOrgs>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the users catastrophe orgses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (UsersCatastropheOrgs usersCatastropheOrgs : findAll()) {
            remove(usersCatastropheOrgs);
        }
    }

    /**
     * Returns the number of users catastrophe orgses.
     *
     * @return the number of users catastrophe orgses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_USERSCATASTROPHEORGS);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the users catastrophe orgs persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.liferay.challenge.model.UsersCatastropheOrgs")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<UsersCatastropheOrgs>> listenersList = new ArrayList<ModelListener<UsersCatastropheOrgs>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<UsersCatastropheOrgs>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(UsersCatastropheOrgsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}

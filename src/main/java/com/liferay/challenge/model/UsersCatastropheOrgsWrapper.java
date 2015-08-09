package com.liferay.challenge.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link UsersCatastropheOrgs}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgs
 * @generated
 */
public class UsersCatastropheOrgsWrapper implements UsersCatastropheOrgs,
    ModelWrapper<UsersCatastropheOrgs> {
    private UsersCatastropheOrgs _usersCatastropheOrgs;

    public UsersCatastropheOrgsWrapper(
        UsersCatastropheOrgs usersCatastropheOrgs) {
        _usersCatastropheOrgs = usersCatastropheOrgs;
    }

    @Override
    public Class<?> getModelClass() {
        return UsersCatastropheOrgs.class;
    }

    @Override
    public String getModelClassName() {
        return UsersCatastropheOrgs.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("userId", getUserId());
        attributes.put("organizationId", getOrganizationId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Long organizationId = (Long) attributes.get("organizationId");

        if (organizationId != null) {
            setOrganizationId(organizationId);
        }
    }

    /**
    * Returns the primary key of this users catastrophe orgs.
    *
    * @return the primary key of this users catastrophe orgs
    */
    @Override
    public long getPrimaryKey() {
        return _usersCatastropheOrgs.getPrimaryKey();
    }

    /**
    * Sets the primary key of this users catastrophe orgs.
    *
    * @param primaryKey the primary key of this users catastrophe orgs
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _usersCatastropheOrgs.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the user ID of this users catastrophe orgs.
    *
    * @return the user ID of this users catastrophe orgs
    */
    @Override
    public long getUserId() {
        return _usersCatastropheOrgs.getUserId();
    }

    /**
    * Sets the user ID of this users catastrophe orgs.
    *
    * @param userId the user ID of this users catastrophe orgs
    */
    @Override
    public void setUserId(long userId) {
        _usersCatastropheOrgs.setUserId(userId);
    }

    /**
    * Returns the user uuid of this users catastrophe orgs.
    *
    * @return the user uuid of this users catastrophe orgs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _usersCatastropheOrgs.getUserUuid();
    }

    /**
    * Sets the user uuid of this users catastrophe orgs.
    *
    * @param userUuid the user uuid of this users catastrophe orgs
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _usersCatastropheOrgs.setUserUuid(userUuid);
    }

    /**
    * Returns the organization ID of this users catastrophe orgs.
    *
    * @return the organization ID of this users catastrophe orgs
    */
    @Override
    public long getOrganizationId() {
        return _usersCatastropheOrgs.getOrganizationId();
    }

    /**
    * Sets the organization ID of this users catastrophe orgs.
    *
    * @param organizationId the organization ID of this users catastrophe orgs
    */
    @Override
    public void setOrganizationId(long organizationId) {
        _usersCatastropheOrgs.setOrganizationId(organizationId);
    }

    @Override
    public boolean isNew() {
        return _usersCatastropheOrgs.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _usersCatastropheOrgs.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _usersCatastropheOrgs.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _usersCatastropheOrgs.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _usersCatastropheOrgs.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _usersCatastropheOrgs.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _usersCatastropheOrgs.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _usersCatastropheOrgs.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _usersCatastropheOrgs.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _usersCatastropheOrgs.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _usersCatastropheOrgs.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new UsersCatastropheOrgsWrapper((UsersCatastropheOrgs) _usersCatastropheOrgs.clone());
    }

    @Override
    public int compareTo(
        com.liferay.challenge.model.UsersCatastropheOrgs usersCatastropheOrgs) {
        return _usersCatastropheOrgs.compareTo(usersCatastropheOrgs);
    }

    @Override
    public int hashCode() {
        return _usersCatastropheOrgs.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.challenge.model.UsersCatastropheOrgs> toCacheModel() {
        return _usersCatastropheOrgs.toCacheModel();
    }

    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs toEscapedModel() {
        return new UsersCatastropheOrgsWrapper(_usersCatastropheOrgs.toEscapedModel());
    }

    @Override
    public com.liferay.challenge.model.UsersCatastropheOrgs toUnescapedModel() {
        return new UsersCatastropheOrgsWrapper(_usersCatastropheOrgs.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _usersCatastropheOrgs.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _usersCatastropheOrgs.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _usersCatastropheOrgs.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UsersCatastropheOrgsWrapper)) {
            return false;
        }

        UsersCatastropheOrgsWrapper usersCatastropheOrgsWrapper = (UsersCatastropheOrgsWrapper) obj;

        if (Validator.equals(_usersCatastropheOrgs,
                    usersCatastropheOrgsWrapper._usersCatastropheOrgs)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public UsersCatastropheOrgs getWrappedUsersCatastropheOrgs() {
        return _usersCatastropheOrgs;
    }

    @Override
    public UsersCatastropheOrgs getWrappedModel() {
        return _usersCatastropheOrgs;
    }

    @Override
    public void resetOriginalValues() {
        _usersCatastropheOrgs.resetOriginalValues();
    }
}

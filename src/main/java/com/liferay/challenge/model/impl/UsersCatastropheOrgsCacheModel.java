package com.liferay.challenge.model.impl;

import com.liferay.challenge.model.UsersCatastropheOrgs;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing UsersCatastropheOrgs in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgs
 * @generated
 */
public class UsersCatastropheOrgsCacheModel implements CacheModel<UsersCatastropheOrgs>,
    Externalizable {
    public long userId;
    public long organizationId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", organizationId=");
        sb.append(organizationId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public UsersCatastropheOrgs toEntityModel() {
        UsersCatastropheOrgsImpl usersCatastropheOrgsImpl = new UsersCatastropheOrgsImpl();

        usersCatastropheOrgsImpl.setUserId(userId);
        usersCatastropheOrgsImpl.setOrganizationId(organizationId);

        usersCatastropheOrgsImpl.resetOriginalValues();

        return usersCatastropheOrgsImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        userId = objectInput.readLong();
        organizationId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(userId);
        objectOutput.writeLong(organizationId);
    }
}

package com.liferay.challenge.model;

import com.liferay.challenge.service.ClpSerializer;
import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class UsersCatastropheOrgsClp extends BaseModelImpl<UsersCatastropheOrgs>
    implements UsersCatastropheOrgs {
    private long _userId;
    private String _userUuid;
    private long _organizationId;
    private BaseModel<?> _usersCatastropheOrgsRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.challenge.service.ClpSerializer.class;

    public UsersCatastropheOrgsClp() {
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
    public long getPrimaryKey() {
        return _userId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setUserId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _userId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_usersCatastropheOrgsRemoteModel != null) {
            try {
                Class<?> clazz = _usersCatastropheOrgsRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_usersCatastropheOrgsRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public long getOrganizationId() {
        return _organizationId;
    }

    @Override
    public void setOrganizationId(long organizationId) {
        _organizationId = organizationId;

        if (_usersCatastropheOrgsRemoteModel != null) {
            try {
                Class<?> clazz = _usersCatastropheOrgsRemoteModel.getClass();

                Method method = clazz.getMethod("setOrganizationId", long.class);

                method.invoke(_usersCatastropheOrgsRemoteModel, organizationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUsersCatastropheOrgsRemoteModel() {
        return _usersCatastropheOrgsRemoteModel;
    }

    public void setUsersCatastropheOrgsRemoteModel(
        BaseModel<?> usersCatastropheOrgsRemoteModel) {
        _usersCatastropheOrgsRemoteModel = usersCatastropheOrgsRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _usersCatastropheOrgsRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_usersCatastropheOrgsRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UsersCatastropheOrgsLocalServiceUtil.addUsersCatastropheOrgs(this);
        } else {
            UsersCatastropheOrgsLocalServiceUtil.updateUsersCatastropheOrgs(this);
        }
    }

    @Override
    public UsersCatastropheOrgs toEscapedModel() {
        return (UsersCatastropheOrgs) ProxyUtil.newProxyInstance(UsersCatastropheOrgs.class.getClassLoader(),
            new Class[] { UsersCatastropheOrgs.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UsersCatastropheOrgsClp clone = new UsersCatastropheOrgsClp();

        clone.setUserId(getUserId());
        clone.setOrganizationId(getOrganizationId());

        return clone;
    }

    @Override
    public int compareTo(UsersCatastropheOrgs usersCatastropheOrgs) {
        long primaryKey = usersCatastropheOrgs.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UsersCatastropheOrgsClp)) {
            return false;
        }

        UsersCatastropheOrgsClp usersCatastropheOrgs = (UsersCatastropheOrgsClp) obj;

        long primaryKey = usersCatastropheOrgs.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{userId=");
        sb.append(getUserId());
        sb.append(", organizationId=");
        sb.append(getOrganizationId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(10);

        sb.append("<model><model-name>");
        sb.append("com.liferay.challenge.model.UsersCatastropheOrgs");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>organizationId</column-name><column-value><![CDATA[");
        sb.append(getOrganizationId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

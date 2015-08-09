package com.liferay.challenge.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.challenge.service.http.UsersCatastropheOrgsServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.challenge.service.http.UsersCatastropheOrgsServiceSoap
 * @generated
 */
public class UsersCatastropheOrgsSoap implements Serializable {
    private long _userId;
    private long _organizationId;

    public UsersCatastropheOrgsSoap() {
    }

    public static UsersCatastropheOrgsSoap toSoapModel(
        UsersCatastropheOrgs model) {
        UsersCatastropheOrgsSoap soapModel = new UsersCatastropheOrgsSoap();

        soapModel.setUserId(model.getUserId());
        soapModel.setOrganizationId(model.getOrganizationId());

        return soapModel;
    }

    public static UsersCatastropheOrgsSoap[] toSoapModels(
        UsersCatastropheOrgs[] models) {
        UsersCatastropheOrgsSoap[] soapModels = new UsersCatastropheOrgsSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UsersCatastropheOrgsSoap[][] toSoapModels(
        UsersCatastropheOrgs[][] models) {
        UsersCatastropheOrgsSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UsersCatastropheOrgsSoap[models.length][models[0].length];
        } else {
            soapModels = new UsersCatastropheOrgsSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UsersCatastropheOrgsSoap[] toSoapModels(
        List<UsersCatastropheOrgs> models) {
        List<UsersCatastropheOrgsSoap> soapModels = new ArrayList<UsersCatastropheOrgsSoap>(models.size());

        for (UsersCatastropheOrgs model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UsersCatastropheOrgsSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _userId;
    }

    public void setPrimaryKey(long pk) {
        setUserId(pk);
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getOrganizationId() {
        return _organizationId;
    }

    public void setOrganizationId(long organizationId) {
        _organizationId = organizationId;
    }
}

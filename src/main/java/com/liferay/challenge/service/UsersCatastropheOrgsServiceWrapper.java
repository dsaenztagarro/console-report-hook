package com.liferay.challenge.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsersCatastropheOrgsService}.
 *
 * @author Brian Wing Shun Chan
 * @see UsersCatastropheOrgsService
 * @generated
 */
public class UsersCatastropheOrgsServiceWrapper
    implements UsersCatastropheOrgsService,
        ServiceWrapper<UsersCatastropheOrgsService> {
    private UsersCatastropheOrgsService _usersCatastropheOrgsService;

    public UsersCatastropheOrgsServiceWrapper(
        UsersCatastropheOrgsService usersCatastropheOrgsService) {
        _usersCatastropheOrgsService = usersCatastropheOrgsService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _usersCatastropheOrgsService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _usersCatastropheOrgsService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _usersCatastropheOrgsService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public UsersCatastropheOrgsService getWrappedUsersCatastropheOrgsService() {
        return _usersCatastropheOrgsService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedUsersCatastropheOrgsService(
        UsersCatastropheOrgsService usersCatastropheOrgsService) {
        _usersCatastropheOrgsService = usersCatastropheOrgsService;
    }

    @Override
    public UsersCatastropheOrgsService getWrappedService() {
        return _usersCatastropheOrgsService;
    }

    @Override
    public void setWrappedService(
        UsersCatastropheOrgsService usersCatastropheOrgsService) {
        _usersCatastropheOrgsService = usersCatastropheOrgsService;
    }
}

package com.liferay.challenge.service.messaging;

import com.liferay.challenge.service.ClpSerializer;
import com.liferay.challenge.service.UsersCatastropheOrgsLocalServiceUtil;
import com.liferay.challenge.service.UsersCatastropheOrgsServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            UsersCatastropheOrgsLocalServiceUtil.clearService();

            UsersCatastropheOrgsServiceUtil.clearService();
        }
    }
}

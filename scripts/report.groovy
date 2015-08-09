command = com.liferay.portal.kernel.bean.PortletBeanLocatorUtil.locate("script-utils-1.0.0-SNAPSHOT", "com.liferay.challenge.command.CatastropheReportCommand")

command.setPortletConfig(portletConfig);

success = command.run()

if (success) {
	out.println("Success!")
} else {
	out.println("Error!")
}
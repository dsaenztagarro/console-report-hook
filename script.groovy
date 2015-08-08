command = com.liferay.portal.kernel.bean.PortletBeanLocatorUtil.locate(
	"script-utils-1.0.0-SNAPSHOT", "com.liferay.challenge.command.CatastropheCommand")

command.setPortletConfig(portletConfig);

println(command.run())